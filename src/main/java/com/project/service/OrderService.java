package com.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dto.OrderDTO;
import com.project.mapper.OrderMapper;

@Service
public class OrderService {

	private  OrderMapper mapper;

	public OrderService(OrderMapper mapper) {
		super();
		this.mapper = mapper;
	}

	public List<OrderDTO> searchUser(String search) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("search", search);
		return mapper.searchUser(map);
	}

	public List<OrderDTO> viewAllOrder() {
		return mapper.viewAllOrder();
	}

	public List<OrderDTO> searchUserByDateRange(String startDate, String endDate, String search) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("startDate", startDate);
        map.put("endDate", endDate);
        map.put("search", search);
        return mapper.searchUserByDateRange(map);
    }

	public void deleteBuyAndRelatedData(String companyNo) {
		 try {
		        // 먼저 buy 테이블에서 삭제
		        mapper.deleteOrdersByCompanyNo(companyNo);
		        
		        // 다음으로 MATERIAL 테이블에서 삭제
		        mapper.deleteMaterialByCompanyNo(companyNo);
		        
		        // 마지막으로 COMPANY_BUY 테이블에서 삭제
		        mapper.deleteCompanyBuyByCompanyNo(companyNo);
		    } catch (Exception e) {
		        throw new RuntimeException("데이터 삭제 중 오류 발생", e);
		    }		
	}

	//원부재료 조회 리스트
	public List<OrderDTO> viewAllMaterial() {
		return mapper.viewAllMaterial();
	}

	public List<OrderDTO> searchMaterial(String search) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("search", search);
		return mapper.searchMaterial(map);
	}

	public void deleteMaterialAndRelatedData(String companyNo) {
		 try {
		        // 먼저 buy 테이블에서 삭제
		        mapper.deleteBuy(companyNo);
		        
		        // 다음으로 MATERIAL 테이블에서 삭제
		        mapper.deleteMaterial(companyNo);
		        
		        // 마지막으로 COMPANY_BUY 테이블에서 삭제
		        mapper.deleteCompanyBuy(companyNo);
		    } catch (Exception e) {
		        throw new RuntimeException("데이터 삭제 중 오류 발생", e);
		    }		
	}

	public List<OrderDTO> viewAllContractor() {
		return mapper.viewAllContractor();
	}

	public void deleteContractorAndRelatedData(String companyNo) {
		 try {
		        // 먼저 Manager 테이블에서 삭제
		        mapper.deleteManagerContractor(companyNo);

		        // 마지막으로 COMPANY_BUY 테이블에서 삭제
		        mapper.deleteCompanyBuyContractor(companyNo);
		    } catch (Exception e) {
		        throw new RuntimeException("데이터 삭제 중 오류 발생", e);
		    }		
	}

	 @Transactional
	public void insertOrderRegister(OrderDTO dto) {
	      try {
	            // OrderDTO에서 데이터 추출
	            String dateOrder = dto.getDateOrder();
	            String dateReceived = dto.getDateReceived();
	            String buyNo = dto.getBuyNo();
	            String buyName = dto.getBuyName();
	            String materialNo = dto.getMaterialNo();
	            String materioalName = dto.getMaterioalName();
	            String materioalAmount = dto.getMaterioalAmount();
	            String companyNo = dto.getCompanyNo();

	             // company_buy 테이블 데이터 삽입
	            mapper.insertIntoCompany(buyName, companyNo);
	            
	             // material 테이블
	            mapper.insertIntoMaterial(materioalName, materialNo, companyNo); 
	            
	             // Buy 테이블에 데이터 삽입
	            mapper.insertIntoBuy(dateOrder, dateReceived, buyNo, materioalAmount, materialNo, companyNo);

	          

	        } catch (Exception e) {
	            throw new RuntimeException("데이터 삽입 중 오류 발생", e);
	        }
	 }
	 public OrderDTO editOrder(String buyNo) {
	       try {
		        return mapper.editOrder(buyNo);
		    } catch (Exception e) {
		        throw new RuntimeException("데이터 조회 중 오류 발생", e);
		    }
	 }

	 public void updateOrder(OrderDTO dto) {
		    try {
		        // OrderDTO에서 데이터 추출
		        String buyNo = dto.getBuyNo();
		        String buyName = dto.getBuyName();
		        String materialNo = dto.getMaterialNo();
		        String materioalName = dto.getMaterioalName();
		        String dateOrder = dto.getDateOrder();
		        String dateReceived = dto.getDateReceived();
		        String materioalAmount = dto.getMaterioalAmount();
		        String companyNo = dto.getCompanyNo();

		        // Material 테이블 업데이트
		        mapper.OrderupdateMaterial(materialNo, materioalName, companyNo);

		        // Company_Buy 테이블 업데이트
		        mapper.OrderupdateCompanyBuy(buyName, companyNo);

		        // Buy 테이블 업데이트
		        mapper.OrderupdateBuy(buyNo, dateOrder, dateReceived, materioalAmount, materialNo, companyNo);


		    } catch (Exception e) {
		        throw new RuntimeException("데이터 업데이트 중 오류 발생", e);
		    }
		}
	 
	 public void registerMaterial(OrderDTO dto) {
			 try {
		            // OrderDTO에서 데이터 추출
		            String buyNo = dto.getBuyNo();
		            String materialNo = dto.getMaterialNo();
		            String materioalName = dto.getMaterioalName();
		            String mUnit = dto.getmUnit();
		            int mBOXcount = dto.getmBOXcount();
		            int mTotalPrice = dto.getmTotalPrice();
		            String companyNo = dto.getCompanyNo();
		            String dateOrder = dto.getDateOrder();

		             //협력업체 company_buy 테이블 데이터 삽입
		            mapper.MaterialinsertIntoCompany(companyNo);
		            
		             //원부재료 material 테이블
		            mapper.MaterialinsertIntoMaterial(materioalName, materialNo, mUnit, mBOXcount, companyNo); 
		            
		             // Buy 테이블에 데이터 삽입
		            mapper.MaterialinsertIntoBuy(buyNo, dateOrder, materialNo, mTotalPrice, companyNo);


		        } catch (Exception e) {
		            throw new RuntimeException("데이터 삽입 중 오류 발생", e);
		        }
	    }
	 	
	 	//협력업체 등록
		public void ContractorRegister(OrderDTO dto) {
			 try {
		            // OrderDTO에서 데이터 추출
				 	String companyNo = dto.getCompanyNo();
		            String buyName = dto.getBuyName();
		            String managerName = dto.getManagerName();
		            String managerContact = dto.getManagerContact();
		            String mMail = dto.getmMail();

		             //협력업체 company_buy 테이블 데이터 삽입
		            mapper.ContractorinsertIntoCompany(companyNo, buyName);
		            
		             //협력업체 manager 테이블에 데이터 삽입
		            mapper.ContractorinsertIntoManager(managerName, managerContact, mMail, companyNo);

		          

		        } catch (Exception e) {
		            throw new RuntimeException("데이터 삽입 중 오류 발생", e);
		        }
		  }

	
	
}

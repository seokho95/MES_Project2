package com.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

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

	
	
	
	
}

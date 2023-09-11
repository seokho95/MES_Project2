package com.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.project.dto.OrderDTO;

@Mapper
public interface OrderMapper {

	List<OrderDTO> searchUser(Map<String, Object> map);

	List<OrderDTO> viewAllOrder();

	List<OrderDTO> searchUserByDateRange(Map<String, Object> map);

	void deleteOrdersByCompanyNo(String companyNo);

	void deleteCompanyBuyByCompanyNo(String companyNo);

	void deleteMaterialByCompanyNo(String companyNo);

	List<OrderDTO> viewAllMaterial();

	List<OrderDTO> searchMaterial(Map<String, Object> map);

	void deleteBuy(String companyNo);

	void deleteMaterial(String companyNo);

	void deleteCompanyBuy(String companyNo);

	List<OrderDTO> viewAllContractor();

	void deleteManagerContractor(String companyNo);

	void deleteCompanyBuyContractor(String companyNo);

	void insertIntoCompany(String buyName, String companyNo);

	void insertIntoMaterial(String materioalName, String materialNo, String companyNo);

	void insertIntoBuy(String dateOrder, String dateReceived, String buyNo, String materioalAmount, String materialNo, String companyNo);
	
	// 에러부분
	OrderDTO editOrder(String buyNo);

	void updateOrder(String buyNo, String buyName, String materialNo, String materioalName, String dateOrder,
			String dateReceived, String materioalAmount, String companyNo);

	void MaterialinsertIntoCompany(String companyNo);

	void MaterialinsertIntoMaterial(String materioalName, String materialNo, String mUnit, int mBOXcount,
			String companyNo);

	void MaterialinsertIntoBuy(String buyNo, String dateOrder, String materialNo, int mTotalPrice, String companyNo);

	void ContractorinsertIntoCompany(String companyNo, String buyName);

	void ContractorinsertIntoManager(String managerName, String managerContact, String mMail,
			String companyNo);

	void OrderupdateMaterial(String materialNo, String materioalName, String companyNo);

	void OrderupdateCompanyBuy(String buyName, String companyNo);

	void OrderupdateBuy(String buyNo, String dateOrder, String dateReceived, String materioalAmount, String materialNo,
			String companyNo);

	




}

package com.move.etb.boot.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.move.etb.boot.dto.CommonListDTO;
import com.move.etb.boot.dto.FromAccountMapDTO;
import com.move.etb.boot.dto.ProductCurrencyMapDTO;
import com.move.etb.boot.dto.ProductMapDTO;

@JsonInclude(Include.NON_NULL)
public class SavingResult implements Serializable {

	private static final long serialVersionUID = -6977433890602477126L;
	
	private BigDecimal productInitialDeposit;
	private BigDecimal productMonthlyInstallmentAmount;
	private String tacValue;
	private String displayName;
	private String fromAccount;
	private String productAccountNo;
	private String productCustomerEmail;
	private String productCustomerName;
	private String productHeirName;
	private String productHeirDOB;
	private String productHeirRelationship;
	private String productFatherName;
	private String productFirstInstallmentDate;
	private String productTerm;
	private String productPromoCode;
	private String productReferralCode;
	private Integer productDisplayOrder;
	private String productCurrencyCode;
	private String productMonthlyAverageTrnx;
	private String productOpeningDate;
	private String productOriginOfFund;
	private String productObjectiveOfAccount;
	private String productProgram;
	private String receiptLink;
	private ReceiptMap receiptMap;
	private ReceiptMapEN receiptMapEN;
	private String responseCode;
	private String responseMessage;
	private String serviceName;
	private String errorCode;
	private List<String> errorParams;
	private String loggerResponseCode;
	private String loggerResponseMessage;
	private String loggerServiceName;
	private String loggerErrorCode;
	private String loggerErrorParams;
	private String delegationErrorParams;
	private Integer tacAttemptCount;
	private String payMode;
	private String effectiveDateDisplay;
	private String effectiveDate;
	private String terminationDate;
	private String terminationDateDisplay;
	private String paymentFrequencyDisplay;
	private StatusInformationMap statusInformationMap;
	
	private LinkedHashMap<String, FromAccountMap> fromAccountMap;
	private List<FromAccountMapDTO> fromAccountList;
	
	private MonetaryInformationMap monetaryInformationMap;
	private LinkedHashMap<String, ProductCurrencyCodeMap> productCurrencyCodeMap;
	private List<ProductCurrencyMapDTO> productCurrencyCodeList;
	
	private LinkedHashMap<String, String> productHeirRelationshipMap;
	private LinkedHashMap<String, String> productMonthlyAverageTrnxMap;
	private LinkedHashMap<String, String> productOriginOfFundMap;
	private LinkedHashMap<String, String> productObjectiveOfAccountMap;
	private LinkedHashMap<String, String> productProgramMap;
	private LinkedHashMap<String, String> productTermMap;
	
	private List<CommonListDTO> productHeirRelationshipList;
	private List<CommonListDTO> productMonthlyAverageTrnxList;
	private List<CommonListDTO> productOriginOfFundList;
	private List<CommonListDTO> productObjectiveOfAccountList;
	private List<CommonListDTO> productProgramList;
	private List<CommonListDTO> productTermList;
	
	private LinkedHashMap<String, ProductMap> topProductMap;
	private List<ProductMapDTO> listProductMap;
	
	private ServiceInfoBean serviceInfoBean;
	
	public BigDecimal getProductInitialDeposit() {
		return productInitialDeposit;
	}
	public void setProductInitialDeposit(BigDecimal productInitialDeposit) {
		this.productInitialDeposit = productInitialDeposit;
	}
	public BigDecimal getProductMonthlyInstallmentAmount() {
		return productMonthlyInstallmentAmount;
	}
	public void setProductMonthlyInstallmentAmount(BigDecimal productMonthlyInstallmentAmount) {
		this.productMonthlyInstallmentAmount = productMonthlyInstallmentAmount;
	}
	public String getTacValue() {
		return tacValue;
	}
	public void setTacValue(String tacValue) {
		this.tacValue = tacValue;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getProductAccountNo() {
		return productAccountNo;
	}
	public void setProductAccountNo(String productAccountNo) {
		this.productAccountNo = productAccountNo;
	}
	public String getProductCustomerEmail() {
		return productCustomerEmail;
	}
	public void setProductCustomerEmail(String productCustomerEmail) {
		this.productCustomerEmail = productCustomerEmail;
	}
	public String getProductCustomerName() {
		return productCustomerName;
	}
	public void setProductCustomerName(String productCustomerName) {
		this.productCustomerName = productCustomerName;
	}
	public String getProductHeirName() {
		return productHeirName;
	}
	public void setProductHeirName(String productHeirName) {
		this.productHeirName = productHeirName;
	}
	public String getProductHeirDOB() {
		return productHeirDOB;
	}
	public void setProductHeirDOB(String productHeirDOB) {
		this.productHeirDOB = productHeirDOB;
	}
	public String getProductHeirRelationship() {
		return productHeirRelationship;
	}
	public void setProductHeirRelationship(String productHeirRelationship) {
		this.productHeirRelationship = productHeirRelationship;
	}
	public String getProductFatherName() {
		return productFatherName;
	}
	public void setProductFatherName(String productFatherName) {
		this.productFatherName = productFatherName;
	}
	public String getProductFirstInstallmentDate() {
		return productFirstInstallmentDate;
	}
	public void setProductFirstInstallmentDate(String productFirstInstallmentDate) {
		this.productFirstInstallmentDate = productFirstInstallmentDate;
	}
	public String getProductTerm() {
		return productTerm;
	}
	public void setProductTerm(String productTerm) {
		this.productTerm = productTerm;
	}
	public String getProductPromoCode() {
		return productPromoCode;
	}
	public void setProductPromoCode(String productPromoCode) {
		this.productPromoCode = productPromoCode;
	}
	public String getProductReferralCode() {
		return productReferralCode;
	}
	public void setProductReferralCode(String productReferralCode) {
		this.productReferralCode = productReferralCode;
	}
	public Integer getProductDisplayOrder() {
		return productDisplayOrder;
	}
	public void setProductDisplayOrder(Integer productDisplayOrder) {
		this.productDisplayOrder = productDisplayOrder;
	}
	public String getProductCurrencyCode() {
		return productCurrencyCode;
	}
	public void setProductCurrencyCode(String productCurrencyCode) {
		this.productCurrencyCode = productCurrencyCode;
	}
	public String getProductMonthlyAverageTrnx() {
		return productMonthlyAverageTrnx;
	}
	public void setProductMonthlyAverageTrnx(String productMonthlyAverageTrnx) {
		this.productMonthlyAverageTrnx = productMonthlyAverageTrnx;
	}
	public String getProductOpeningDate() {
		return productOpeningDate;
	}
	public void setProductOpeningDate(String productOpeningDate) {
		this.productOpeningDate = productOpeningDate;
	}
	public String getProductOriginOfFund() {
		return productOriginOfFund;
	}
	public void setProductOriginOfFund(String productOriginOfFund) {
		this.productOriginOfFund = productOriginOfFund;
	}
	public String getProductObjectiveOfAccount() {
		return productObjectiveOfAccount;
	}
	public void setProductObjectiveOfAccount(String productObjectiveOfAccount) {
		this.productObjectiveOfAccount = productObjectiveOfAccount;
	}
	public String getProductProgram() {
		return productProgram;
	}
	public void setProductProgram(String productProgram) {
		this.productProgram = productProgram;
	}
	public String getReceiptLink() {
		return receiptLink;
	}
	public void setReceiptLink(String receiptLink) {
		this.receiptLink = receiptLink;
	}
	public ReceiptMap getReceiptMap() {
		return receiptMap;
	}
	public void setReceiptMap(ReceiptMap receiptMap) {
		this.receiptMap = receiptMap;
	}
	public ReceiptMapEN getReceiptMapEN() {
		return receiptMapEN;
	}
	public void setReceiptMapEN(ReceiptMapEN receiptMapEN) {
		this.receiptMapEN = receiptMapEN;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public List<String> getErrorParams() {
		return errorParams;
	}
	public void setErrorParams(List<String> errorParams) {
		this.errorParams = errorParams;
	}
	public String getLoggerResponseCode() {
		return loggerResponseCode;
	}
	public void setLoggerResponseCode(String loggerResponseCode) {
		this.loggerResponseCode = loggerResponseCode;
	}
	public String getLoggerResponseMessage() {
		return loggerResponseMessage;
	}
	public void setLoggerResponseMessage(String loggerResponseMessage) {
		this.loggerResponseMessage = loggerResponseMessage;
	}
	public String getLoggerServiceName() {
		return loggerServiceName;
	}
	public void setLoggerServiceName(String loggerServiceName) {
		this.loggerServiceName = loggerServiceName;
	}
	public String getLoggerErrorCode() {
		return loggerErrorCode;
	}
	public void setLoggerErrorCode(String loggerErrorCode) {
		this.loggerErrorCode = loggerErrorCode;
	}
	public String getLoggerErrorParams() {
		return loggerErrorParams;
	}
	public void setLoggerErrorParams(String loggerErrorParams) {
		this.loggerErrorParams = loggerErrorParams;
	}
	public String getDelegationErrorParams() {
		return delegationErrorParams;
	}
	public void setDelegationErrorParams(String delegationErrorParams) {
		this.delegationErrorParams = delegationErrorParams;
	}
	public Integer getTacAttemptCount() {
		return tacAttemptCount;
	}
	public void setTacAttemptCount(Integer tacAttemptCount) {
		this.tacAttemptCount = tacAttemptCount;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public String getEffectiveDateDisplay() {
		return effectiveDateDisplay;
	}
	public void setEffectiveDateDisplay(String effectiveDateDisplay) {
		this.effectiveDateDisplay = effectiveDateDisplay;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getTerminationDate() {
		return terminationDate;
	}
	public void setTerminationDate(String terminationDate) {
		this.terminationDate = terminationDate;
	}
	public String getTerminationDateDisplay() {
		return terminationDateDisplay;
	}
	public void setTerminationDateDisplay(String terminationDateDisplay) {
		this.terminationDateDisplay = terminationDateDisplay;
	}
	public String getPaymentFrequencyDisplay() {
		return paymentFrequencyDisplay;
	}
	public void setPaymentFrequencyDisplay(String paymentFrequencyDisplay) {
		this.paymentFrequencyDisplay = paymentFrequencyDisplay;
	}
	public LinkedHashMap<String, FromAccountMap> getFromAccountMap() {
		return fromAccountMap;
	}
	public void setFromAccountMap(LinkedHashMap<String, FromAccountMap> fromAccountMap) {
		this.fromAccountMap = fromAccountMap;
	}
	public List<FromAccountMapDTO> getFromAccountList() {
		return fromAccountList;
	}
	public void setFromAccountList(List<FromAccountMapDTO> fromAccountList) {
		this.fromAccountList = fromAccountList;
	}
	public MonetaryInformationMap getMonetaryInformationMap() {
		return monetaryInformationMap;
	}
	public void setMonetaryInformationMap(MonetaryInformationMap monetaryInformationMap) {
		this.monetaryInformationMap = monetaryInformationMap;
	}
	public LinkedHashMap<String, ProductCurrencyCodeMap> getProductCurrencyCodeMap() {
		return productCurrencyCodeMap;
	}
	public void setProductCurrencyCodeMap(LinkedHashMap<String, ProductCurrencyCodeMap> productCurrencyCodeMap) {
		this.productCurrencyCodeMap = productCurrencyCodeMap;
	}
	public List<ProductCurrencyMapDTO> getProductCurrencyCodeList() {
		return productCurrencyCodeList;
	}
	public void setProductCurrencyCodeList(List<ProductCurrencyMapDTO> productCurrencyCodeList) {
		this.productCurrencyCodeList = productCurrencyCodeList;
	}
	public LinkedHashMap<String, String> getProductHeirRelationshipMap() {
		return productHeirRelationshipMap;
	}
	public void setProductHeirRelationshipMap(LinkedHashMap<String, String> productHeirRelationshipMap) {
		this.productHeirRelationshipMap = productHeirRelationshipMap;
	}
	public LinkedHashMap<String, String> getProductMonthlyAverageTrnxMap() {
		return productMonthlyAverageTrnxMap;
	}
	public void setProductMonthlyAverageTrnxMap(LinkedHashMap<String, String> productMonthlyAverageTrnxMap) {
		this.productMonthlyAverageTrnxMap = productMonthlyAverageTrnxMap;
	}
	public LinkedHashMap<String, String> getProductOriginOfFundMap() {
		return productOriginOfFundMap;
	}
	public void setProductOriginOfFundMap(LinkedHashMap<String, String> productOriginOfFundMap) {
		this.productOriginOfFundMap = productOriginOfFundMap;
	}
	public LinkedHashMap<String, String> getProductObjectiveOfAccountMap() {
		return productObjectiveOfAccountMap;
	}
	public void setProductObjectiveOfAccountMap(LinkedHashMap<String, String> productObjectiveOfAccountMap) {
		this.productObjectiveOfAccountMap = productObjectiveOfAccountMap;
	}
	public LinkedHashMap<String, String> getProductProgramMap() {
		return productProgramMap;
	}
	public void setProductProgramMap(LinkedHashMap<String, String> productProgramMap) {
		this.productProgramMap = productProgramMap;
	}
	public LinkedHashMap<String, String> getProductTermMap() {
		return productTermMap;
	}
	public void setProductTermMap(LinkedHashMap<String, String> productTermMap) {
		this.productTermMap = productTermMap;
	}
	public List<CommonListDTO> getProductHeirRelationshipList() {
		return productHeirRelationshipList;
	}
	public void setProductHeirRelationshipList(List<CommonListDTO> productHeirRelationshipList) {
		this.productHeirRelationshipList = productHeirRelationshipList;
	}
	public List<CommonListDTO> getProductMonthlyAverageTrnxList() {
		return productMonthlyAverageTrnxList;
	}
	public void setProductMonthlyAverageTrnxList(List<CommonListDTO> productMonthlyAverageTrnxList) {
		this.productMonthlyAverageTrnxList = productMonthlyAverageTrnxList;
	}
	public List<CommonListDTO> getProductOriginOfFundList() {
		return productOriginOfFundList;
	}
	public void setProductOriginOfFundList(List<CommonListDTO> productOriginOfFundList) {
		this.productOriginOfFundList = productOriginOfFundList;
	}
	public List<CommonListDTO> getProductObjectiveOfAccountList() {
		return productObjectiveOfAccountList;
	}
	public void setProductObjectiveOfAccountList(List<CommonListDTO> productObjectiveOfAccountList) {
		this.productObjectiveOfAccountList = productObjectiveOfAccountList;
	}
	public List<CommonListDTO> getProductProgramList() {
		return productProgramList;
	}
	public void setProductProgramList(List<CommonListDTO> productProgramList) {
		this.productProgramList = productProgramList;
	}
	public List<CommonListDTO> getProductTermList() {
		return productTermList;
	}
	public void setProductTermList(List<CommonListDTO> productTermList) {
		this.productTermList = productTermList;
	}
	public LinkedHashMap<String, ProductMap> getTopProductMap() {
		return topProductMap;
	}
	public void setTopProductMap(LinkedHashMap<String, ProductMap> topProductMap) {
		this.topProductMap = topProductMap;
	}
	public List<ProductMapDTO> getListProductMap() {
		return listProductMap;
	}
	public void setListProductMap(List<ProductMapDTO> listProductMap) {
		this.listProductMap = listProductMap;
	}
	public ServiceInfoBean getServiceInfoBean() {
		return serviceInfoBean;
	}
	public void setServiceInfoBean(ServiceInfoBean serviceInfoBean) {
		this.serviceInfoBean = serviceInfoBean;
	}
	public StatusInformationMap getStatusInformationMap() {
		return statusInformationMap;
	}
	public void setStatusInformationMap(StatusInformationMap statusInformationMap) {
		this.statusInformationMap = statusInformationMap;
	}
}

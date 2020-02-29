/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcReqQueryTradeResultBySerialField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcReqQueryTradeResultBySerialField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcReqQueryTradeResultBySerialField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcReqQueryTradeResultBySerialField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeCode_set(swigCPtr, this, value);
	}

	public String getTradeCode() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeCode_get(swigCPtr, this);
	}

	public void setBankID(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankBranchID_set(swigCPtr, this, value);
	}

	public String getBankBranchID() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankBranchID_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerID_get(swigCPtr, this);
	}

	public void setBrokerBranchID(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerBranchID_set(swigCPtr, this, value);
	}

	public String getBrokerBranchID() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerBranchID_get(swigCPtr, this);
	}

	public void setTradeDate(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeDate_set(swigCPtr, this, value);
	}

	public String getTradeDate() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeDate_get(swigCPtr, this);
	}

	public void setTradeTime(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeTime_set(swigCPtr, this, value);
	}

	public String getTradeTime() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeTime_get(swigCPtr, this);
	}

	public void setBankSerial(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankSerial_set(swigCPtr, this, value);
	}

	public String getBankSerial() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankSerial_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradingDay_get(swigCPtr, this);
	}

	public void setPlateSerial(int value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_PlateSerial_set(swigCPtr, this, value);
	}

	public int getPlateSerial() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_PlateSerial_get(swigCPtr, this);
	}

	public void setLastFragment(char value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_LastFragment_set(swigCPtr, this, value);
	}

	public char getLastFragment() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_LastFragment_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_SessionID_get(swigCPtr, this);
	}

	public void setReference(int value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_Reference_set(swigCPtr, this, value);
	}

	public int getReference() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_Reference_get(swigCPtr, this);
	}

	public void setRefrenceIssureType(char value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssureType_set(swigCPtr, this, value);
	}

	public char getRefrenceIssureType() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssureType_get(swigCPtr, this);
	}

	public void setRefrenceIssure(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssure_set(swigCPtr, this, value);
	}

	public String getRefrenceIssure() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssure_get(swigCPtr, this);
	}

	public void setCustomerName(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_CustomerName_set(swigCPtr, this, value);
	}

	public String getCustomerName() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_CustomerName_get(swigCPtr, this);
	}

	public void setIdCardType(char value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_IdCardType_set(swigCPtr, this, value);
	}

	public char getIdCardType() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_IdCardType_get(swigCPtr, this);
	}

	public void setIdentifiedCardNo(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_IdentifiedCardNo_set(swigCPtr, this, value);
	}

	public String getIdentifiedCardNo() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_IdentifiedCardNo_get(swigCPtr, this);
	}

	public void setCustType(char value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_CustType_set(swigCPtr, this, value);
	}

	public char getCustType() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_CustType_get(swigCPtr, this);
	}

	public void setBankAccount(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankAccount_set(swigCPtr, this, value);
	}

	public String getBankAccount() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankAccount_get(swigCPtr, this);
	}

	public void setBankPassWord(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankPassWord_set(swigCPtr, this, value);
	}

	public String getBankPassWord() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankPassWord_get(swigCPtr, this);
	}

	public void setAccountID(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_AccountID_get(swigCPtr, this);
	}

	public void setPassword(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_Password_set(swigCPtr, this, value);
	}

	public String getPassword() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_Password_get(swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_CurrencyID_get(swigCPtr, this);
	}

	public void setTradeAmount(double value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeAmount_set(swigCPtr, this, value);
	}

	public double getTradeAmount() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeAmount_get(swigCPtr, this);
	}

	public void setDigest(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_Digest_get(swigCPtr, this);
	}

	public void setLongCustomerName(String value) {
		thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_LongCustomerName_set(swigCPtr, this, value);
	}

	public String getLongCustomerName() {
		return thosttraderapiJNI.CThostFtdcReqQueryTradeResultBySerialField_LongCustomerName_get(swigCPtr, this);
	}

	public CThostFtdcReqQueryTradeResultBySerialField() {
		this(thosttraderapiJNI.new_CThostFtdcReqQueryTradeResultBySerialField(), true);
	}

}

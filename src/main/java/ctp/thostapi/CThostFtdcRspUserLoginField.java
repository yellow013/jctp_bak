/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcRspUserLoginField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcRspUserLoginField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcRspUserLoginField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcRspUserLoginField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradingDay(String value) {
		thosttraderapiJNI.CThostFtdcRspUserLoginField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return thosttraderapiJNI.CThostFtdcRspUserLoginField_TradingDay_get(swigCPtr, this);
	}

	public void setLoginTime(String value) {
		thosttraderapiJNI.CThostFtdcRspUserLoginField_LoginTime_set(swigCPtr, this, value);
	}

	public String getLoginTime() {
		return thosttraderapiJNI.CThostFtdcRspUserLoginField_LoginTime_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		thosttraderapiJNI.CThostFtdcRspUserLoginField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return thosttraderapiJNI.CThostFtdcRspUserLoginField_BrokerID_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		thosttraderapiJNI.CThostFtdcRspUserLoginField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return thosttraderapiJNI.CThostFtdcRspUserLoginField_UserID_get(swigCPtr, this);
	}

	public void setSystemName(String value) {
		thosttraderapiJNI.CThostFtdcRspUserLoginField_SystemName_set(swigCPtr, this, value);
	}

	public String getSystemName() {
		return thosttraderapiJNI.CThostFtdcRspUserLoginField_SystemName_get(swigCPtr, this);
	}

	public void setFrontID(int value) {
		thosttraderapiJNI.CThostFtdcRspUserLoginField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID() {
		return thosttraderapiJNI.CThostFtdcRspUserLoginField_FrontID_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		thosttraderapiJNI.CThostFtdcRspUserLoginField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return thosttraderapiJNI.CThostFtdcRspUserLoginField_SessionID_get(swigCPtr, this);
	}

	public void setMaxOrderRef(String value) {
		thosttraderapiJNI.CThostFtdcRspUserLoginField_MaxOrderRef_set(swigCPtr, this, value);
	}

	public String getMaxOrderRef() {
		return thosttraderapiJNI.CThostFtdcRspUserLoginField_MaxOrderRef_get(swigCPtr, this);
	}

	public void setSHFETime(String value) {
		thosttraderapiJNI.CThostFtdcRspUserLoginField_SHFETime_set(swigCPtr, this, value);
	}

	public String getSHFETime() {
		return thosttraderapiJNI.CThostFtdcRspUserLoginField_SHFETime_get(swigCPtr, this);
	}

	public void setDCETime(String value) {
		thosttraderapiJNI.CThostFtdcRspUserLoginField_DCETime_set(swigCPtr, this, value);
	}

	public String getDCETime() {
		return thosttraderapiJNI.CThostFtdcRspUserLoginField_DCETime_get(swigCPtr, this);
	}

	public void setCZCETime(String value) {
		thosttraderapiJNI.CThostFtdcRspUserLoginField_CZCETime_set(swigCPtr, this, value);
	}

	public String getCZCETime() {
		return thosttraderapiJNI.CThostFtdcRspUserLoginField_CZCETime_get(swigCPtr, this);
	}

	public void setFFEXTime(String value) {
		thosttraderapiJNI.CThostFtdcRspUserLoginField_FFEXTime_set(swigCPtr, this, value);
	}

	public String getFFEXTime() {
		return thosttraderapiJNI.CThostFtdcRspUserLoginField_FFEXTime_get(swigCPtr, this);
	}

	public void setINETime(String value) {
		thosttraderapiJNI.CThostFtdcRspUserLoginField_INETime_set(swigCPtr, this, value);
	}

	public String getINETime() {
		return thosttraderapiJNI.CThostFtdcRspUserLoginField_INETime_get(swigCPtr, this);
	}

	public CThostFtdcRspUserLoginField() {
		this(thosttraderapiJNI.new_CThostFtdcRspUserLoginField(), true);
	}

}
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcLoginInfoField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcLoginInfoField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcLoginInfoField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcLoginInfoField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setFrontID(int value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_FrontID_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_SessionID_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_BrokerID_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_UserID_get(swigCPtr, this);
	}

	public void setLoginDate(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_LoginDate_set(swigCPtr, this, value);
	}

	public String getLoginDate() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_LoginDate_get(swigCPtr, this);
	}

	public void setLoginTime(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_LoginTime_set(swigCPtr, this, value);
	}

	public String getLoginTime() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_LoginTime_get(swigCPtr, this);
	}

	public void setIPAddress(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_IPAddress_get(swigCPtr, this);
	}

	public void setUserProductInfo(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_UserProductInfo_set(swigCPtr, this, value);
	}

	public String getUserProductInfo() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_UserProductInfo_get(swigCPtr, this);
	}

	public void setInterfaceProductInfo(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_InterfaceProductInfo_set(swigCPtr, this, value);
	}

	public String getInterfaceProductInfo() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_InterfaceProductInfo_get(swigCPtr, this);
	}

	public void setProtocolInfo(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_ProtocolInfo_set(swigCPtr, this, value);
	}

	public String getProtocolInfo() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_ProtocolInfo_get(swigCPtr, this);
	}

	public void setSystemName(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_SystemName_set(swigCPtr, this, value);
	}

	public String getSystemName() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_SystemName_get(swigCPtr, this);
	}

	public void setPasswordDeprecated(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_PasswordDeprecated_set(swigCPtr, this, value);
	}

	public String getPasswordDeprecated() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_PasswordDeprecated_get(swigCPtr, this);
	}

	public void setMaxOrderRef(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_MaxOrderRef_set(swigCPtr, this, value);
	}

	public String getMaxOrderRef() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_MaxOrderRef_get(swigCPtr, this);
	}

	public void setSHFETime(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_SHFETime_set(swigCPtr, this, value);
	}

	public String getSHFETime() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_SHFETime_get(swigCPtr, this);
	}

	public void setDCETime(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_DCETime_set(swigCPtr, this, value);
	}

	public String getDCETime() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_DCETime_get(swigCPtr, this);
	}

	public void setCZCETime(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_CZCETime_set(swigCPtr, this, value);
	}

	public String getCZCETime() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_CZCETime_get(swigCPtr, this);
	}

	public void setFFEXTime(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_FFEXTime_set(swigCPtr, this, value);
	}

	public String getFFEXTime() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_FFEXTime_get(swigCPtr, this);
	}

	public void setMacAddress(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_MacAddress_get(swigCPtr, this);
	}

	public void setOneTimePassword(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_OneTimePassword_set(swigCPtr, this, value);
	}

	public String getOneTimePassword() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_OneTimePassword_get(swigCPtr, this);
	}

	public void setINETime(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_INETime_set(swigCPtr, this, value);
	}

	public String getINETime() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_INETime_get(swigCPtr, this);
	}

	public void setIsQryControl(int value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_IsQryControl_set(swigCPtr, this, value);
	}

	public int getIsQryControl() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_IsQryControl_get(swigCPtr, this);
	}

	public void setLoginRemark(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_LoginRemark_set(swigCPtr, this, value);
	}

	public String getLoginRemark() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_LoginRemark_get(swigCPtr, this);
	}

	public void setPassword(String value) {
		thosttraderapiJNI.CThostFtdcLoginInfoField_Password_set(swigCPtr, this, value);
	}

	public String getPassword() {
		return thosttraderapiJNI.CThostFtdcLoginInfoField_Password_get(swigCPtr, this);
	}

	public CThostFtdcLoginInfoField() {
		this(thosttraderapiJNI.new_CThostFtdcLoginInfoField(), true);
	}

}

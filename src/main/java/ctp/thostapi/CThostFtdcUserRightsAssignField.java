/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcUserRightsAssignField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcUserRightsAssignField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcUserRightsAssignField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcUserRightsAssignField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		thosttraderapiJNI.CThostFtdcUserRightsAssignField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return thosttraderapiJNI.CThostFtdcUserRightsAssignField_BrokerID_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		thosttraderapiJNI.CThostFtdcUserRightsAssignField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return thosttraderapiJNI.CThostFtdcUserRightsAssignField_UserID_get(swigCPtr, this);
	}

	public void setDRIdentityID(int value) {
		thosttraderapiJNI.CThostFtdcUserRightsAssignField_DRIdentityID_set(swigCPtr, this, value);
	}

	public int getDRIdentityID() {
		return thosttraderapiJNI.CThostFtdcUserRightsAssignField_DRIdentityID_get(swigCPtr, this);
	}

	public CThostFtdcUserRightsAssignField() {
		this(thosttraderapiJNI.new_CThostFtdcUserRightsAssignField(), true);
	}

}
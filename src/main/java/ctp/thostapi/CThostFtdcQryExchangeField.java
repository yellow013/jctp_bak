/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcQryExchangeField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQryExchangeField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryExchangeField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcQryExchangeField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setExchangeID(String value) {
		thosttraderapiJNI.CThostFtdcQryExchangeField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return thosttraderapiJNI.CThostFtdcQryExchangeField_ExchangeID_get(swigCPtr, this);
	}

	public CThostFtdcQryExchangeField() {
		this(thosttraderapiJNI.new_CThostFtdcQryExchangeField(), true);
	}

}

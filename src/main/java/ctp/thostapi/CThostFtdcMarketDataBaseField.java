/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcMarketDataBaseField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcMarketDataBaseField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcMarketDataBaseField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcMarketDataBaseField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradingDay(String value) {
		thosttraderapiJNI.CThostFtdcMarketDataBaseField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return thosttraderapiJNI.CThostFtdcMarketDataBaseField_TradingDay_get(swigCPtr, this);
	}

	public void setPreSettlementPrice(double value) {
		thosttraderapiJNI.CThostFtdcMarketDataBaseField_PreSettlementPrice_set(swigCPtr, this, value);
	}

	public double getPreSettlementPrice() {
		return thosttraderapiJNI.CThostFtdcMarketDataBaseField_PreSettlementPrice_get(swigCPtr, this);
	}

	public void setPreClosePrice(double value) {
		thosttraderapiJNI.CThostFtdcMarketDataBaseField_PreClosePrice_set(swigCPtr, this, value);
	}

	public double getPreClosePrice() {
		return thosttraderapiJNI.CThostFtdcMarketDataBaseField_PreClosePrice_get(swigCPtr, this);
	}

	public void setPreOpenInterest(double value) {
		thosttraderapiJNI.CThostFtdcMarketDataBaseField_PreOpenInterest_set(swigCPtr, this, value);
	}

	public double getPreOpenInterest() {
		return thosttraderapiJNI.CThostFtdcMarketDataBaseField_PreOpenInterest_get(swigCPtr, this);
	}

	public void setPreDelta(double value) {
		thosttraderapiJNI.CThostFtdcMarketDataBaseField_PreDelta_set(swigCPtr, this, value);
	}

	public double getPreDelta() {
		return thosttraderapiJNI.CThostFtdcMarketDataBaseField_PreDelta_get(swigCPtr, this);
	}

	public CThostFtdcMarketDataBaseField() {
		this(thosttraderapiJNI.new_CThostFtdcMarketDataBaseField(), true);
	}

}

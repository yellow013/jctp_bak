/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcSyncingInstrumentMarginRateField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcSyncingInstrumentMarginRateField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcSyncingInstrumentMarginRateField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcSyncingInstrumentMarginRateField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setInstrumentID(String value) {
		thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_InstrumentID_get(swigCPtr, this);
	}

	public void setInvestorRange(char value) {
		thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_InvestorRange_set(swigCPtr, this, value);
	}

	public char getInvestorRange() {
		return thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_InvestorRange_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_InvestorID_get(swigCPtr, this);
	}

	public void setHedgeFlag(char value) {
		thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_HedgeFlag_set(swigCPtr, this, value);
	}

	public char getHedgeFlag() {
		return thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_HedgeFlag_get(swigCPtr, this);
	}

	public void setLongMarginRatioByMoney(double value) {
		thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByMoney_set(swigCPtr, this, value);
	}

	public double getLongMarginRatioByMoney() {
		return thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByMoney_get(swigCPtr, this);
	}

	public void setLongMarginRatioByVolume(double value) {
		thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByVolume_set(swigCPtr, this, value);
	}

	public double getLongMarginRatioByVolume() {
		return thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByVolume_get(swigCPtr, this);
	}

	public void setShortMarginRatioByMoney(double value) {
		thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
	}

	public double getShortMarginRatioByMoney() {
		return thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByMoney_get(swigCPtr, this);
	}

	public void setShortMarginRatioByVolume(double value) {
		thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByVolume_set(swigCPtr, this,
				value);
	}

	public double getShortMarginRatioByVolume() {
		return thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByVolume_get(swigCPtr,
				this);
	}

	public void setIsRelative(int value) {
		thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_IsRelative_set(swigCPtr, this, value);
	}

	public int getIsRelative() {
		return thosttraderapiJNI.CThostFtdcSyncingInstrumentMarginRateField_IsRelative_get(swigCPtr, this);
	}

	public CThostFtdcSyncingInstrumentMarginRateField() {
		this(thosttraderapiJNI.new_CThostFtdcSyncingInstrumentMarginRateField(), true);
	}

}
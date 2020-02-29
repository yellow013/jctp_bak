/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcSyncFundMortgageField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcSyncFundMortgageField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcSyncFundMortgageField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcSyncFundMortgageField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setMortgageSeqNo(String value) {
		thosttraderapiJNI.CThostFtdcSyncFundMortgageField_MortgageSeqNo_set(swigCPtr, this, value);
	}

	public String getMortgageSeqNo() {
		return thosttraderapiJNI.CThostFtdcSyncFundMortgageField_MortgageSeqNo_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		thosttraderapiJNI.CThostFtdcSyncFundMortgageField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return thosttraderapiJNI.CThostFtdcSyncFundMortgageField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		thosttraderapiJNI.CThostFtdcSyncFundMortgageField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return thosttraderapiJNI.CThostFtdcSyncFundMortgageField_InvestorID_get(swigCPtr, this);
	}

	public void setFromCurrencyID(String value) {
		thosttraderapiJNI.CThostFtdcSyncFundMortgageField_FromCurrencyID_set(swigCPtr, this, value);
	}

	public String getFromCurrencyID() {
		return thosttraderapiJNI.CThostFtdcSyncFundMortgageField_FromCurrencyID_get(swigCPtr, this);
	}

	public void setMortgageAmount(double value) {
		thosttraderapiJNI.CThostFtdcSyncFundMortgageField_MortgageAmount_set(swigCPtr, this, value);
	}

	public double getMortgageAmount() {
		return thosttraderapiJNI.CThostFtdcSyncFundMortgageField_MortgageAmount_get(swigCPtr, this);
	}

	public void setToCurrencyID(String value) {
		thosttraderapiJNI.CThostFtdcSyncFundMortgageField_ToCurrencyID_set(swigCPtr, this, value);
	}

	public String getToCurrencyID() {
		return thosttraderapiJNI.CThostFtdcSyncFundMortgageField_ToCurrencyID_get(swigCPtr, this);
	}

	public CThostFtdcSyncFundMortgageField() {
		this(thosttraderapiJNI.new_CThostFtdcSyncFundMortgageField(), true);
	}

}
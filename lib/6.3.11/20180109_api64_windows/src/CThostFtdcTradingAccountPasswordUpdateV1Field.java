/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcTradingAccountPasswordUpdateV1Field {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcTradingAccountPasswordUpdateV1Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingAccountPasswordUpdateV1Field obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcTradingAccountPasswordUpdateV1Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcTradingAccountPasswordUpdateV1Field_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcTradingAccountPasswordUpdateV1Field_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcTradingAccountPasswordUpdateV1Field_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcTradingAccountPasswordUpdateV1Field_InvestorID_get(swigCPtr, this);
  }

  public void setOldPassword(String value) {
    thosttraderapiJNI.CThostFtdcTradingAccountPasswordUpdateV1Field_OldPassword_set(swigCPtr, this, value);
  }

  public String getOldPassword() {
    return thosttraderapiJNI.CThostFtdcTradingAccountPasswordUpdateV1Field_OldPassword_get(swigCPtr, this);
  }

  public void setNewPassword(String value) {
    thosttraderapiJNI.CThostFtdcTradingAccountPasswordUpdateV1Field_NewPassword_set(swigCPtr, this, value);
  }

  public String getNewPassword() {
    return thosttraderapiJNI.CThostFtdcTradingAccountPasswordUpdateV1Field_NewPassword_get(swigCPtr, this);
  }

  public CThostFtdcTradingAccountPasswordUpdateV1Field() {
    this(thosttraderapiJNI.new_CThostFtdcTradingAccountPasswordUpdateV1Field(), true);
  }

}

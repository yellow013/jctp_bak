/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcReturnResultField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcReturnResultField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReturnResultField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcReturnResultField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReturnCode(String value) {
    thosttraderapiJNI.CThostFtdcReturnResultField_ReturnCode_set(swigCPtr, this, value);
  }

  public String getReturnCode() {
    return thosttraderapiJNI.CThostFtdcReturnResultField_ReturnCode_get(swigCPtr, this);
  }

  public void setDescrInfoForReturnCode(String value) {
    thosttraderapiJNI.CThostFtdcReturnResultField_DescrInfoForReturnCode_set(swigCPtr, this, value);
  }

  public String getDescrInfoForReturnCode() {
    return thosttraderapiJNI.CThostFtdcReturnResultField_DescrInfoForReturnCode_get(swigCPtr, this);
  }

  public CThostFtdcReturnResultField() {
    this(thosttraderapiJNI.new_CThostFtdcReturnResultField(), true);
  }

}

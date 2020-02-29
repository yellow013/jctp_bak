/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcExecOrderField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcExecOrderField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcExecOrderField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				thosttraderapiJNI.delete_CThostFtdcExecOrderField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_InvestorID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_InstrumentID_get(swigCPtr, this);
	}

	public void setExecOrderRef(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_ExecOrderRef_set(swigCPtr, this, value);
	}

	public String getExecOrderRef() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_ExecOrderRef_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_UserID_get(swigCPtr, this);
	}

	public void setVolume(int value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_Volume_set(swigCPtr, this, value);
	}

	public int getVolume() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_Volume_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_RequestID_get(swigCPtr, this);
	}

	public void setBusinessUnit(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_BusinessUnit_set(swigCPtr, this, value);
	}

	public String getBusinessUnit() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_BusinessUnit_get(swigCPtr, this);
	}

	public void setOffsetFlag(char value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_OffsetFlag_set(swigCPtr, this, value);
	}

	public char getOffsetFlag() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_OffsetFlag_get(swigCPtr, this);
	}

	public void setHedgeFlag(char value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_HedgeFlag_set(swigCPtr, this, value);
	}

	public char getHedgeFlag() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_HedgeFlag_get(swigCPtr, this);
	}

	public void setActionType(char value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_ActionType_set(swigCPtr, this, value);
	}

	public char getActionType() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_ActionType_get(swigCPtr, this);
	}

	public void setPosiDirection(char value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_PosiDirection_set(swigCPtr, this, value);
	}

	public char getPosiDirection() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_PosiDirection_get(swigCPtr, this);
	}

	public void setReservePositionFlag(char value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_ReservePositionFlag_set(swigCPtr, this, value);
	}

	public char getReservePositionFlag() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_ReservePositionFlag_get(swigCPtr, this);
	}

	public void setCloseFlag(char value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_CloseFlag_set(swigCPtr, this, value);
	}

	public char getCloseFlag() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_CloseFlag_get(swigCPtr, this);
	}

	public void setExecOrderLocalID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_ExecOrderLocalID_set(swigCPtr, this, value);
	}

	public String getExecOrderLocalID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_ExecOrderLocalID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_ExchangeID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_ClientID_get(swigCPtr, this);
	}

	public void setExchangeInstID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_ExchangeInstID_set(swigCPtr, this, value);
	}

	public String getExchangeInstID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_ExchangeInstID_get(swigCPtr, this);
	}

	public void setTraderID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_TraderID_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_InstallID_get(swigCPtr, this);
	}

	public void setOrderSubmitStatus(char value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
	}

	public char getOrderSubmitStatus() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_OrderSubmitStatus_get(swigCPtr, this);
	}

	public void setNotifySequence(int value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_NotifySequence_set(swigCPtr, this, value);
	}

	public int getNotifySequence() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_NotifySequence_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_TradingDay_get(swigCPtr, this);
	}

	public void setSettlementID(int value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_SettlementID_set(swigCPtr, this, value);
	}

	public int getSettlementID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_SettlementID_get(swigCPtr, this);
	}

	public void setExecOrderSysID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_ExecOrderSysID_set(swigCPtr, this, value);
	}

	public String getExecOrderSysID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_ExecOrderSysID_get(swigCPtr, this);
	}

	public void setInsertDate(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_InsertDate_set(swigCPtr, this, value);
	}

	public String getInsertDate() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_InsertDate_get(swigCPtr, this);
	}

	public void setInsertTime(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_InsertTime_set(swigCPtr, this, value);
	}

	public String getInsertTime() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_InsertTime_get(swigCPtr, this);
	}

	public void setCancelTime(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_CancelTime_set(swigCPtr, this, value);
	}

	public String getCancelTime() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_CancelTime_get(swigCPtr, this);
	}

	public void setExecResult(char value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_ExecResult_set(swigCPtr, this, value);
	}

	public char getExecResult() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_ExecResult_get(swigCPtr, this);
	}

	public void setClearingPartID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_ClearingPartID_set(swigCPtr, this, value);
	}

	public String getClearingPartID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_ClearingPartID_get(swigCPtr, this);
	}

	public void setSequenceNo(int value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_SequenceNo_set(swigCPtr, this, value);
	}

	public int getSequenceNo() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_SequenceNo_get(swigCPtr, this);
	}

	public void setFrontID(int value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_FrontID_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_SessionID_get(swigCPtr, this);
	}

	public void setUserProductInfo(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_UserProductInfo_set(swigCPtr, this, value);
	}

	public String getUserProductInfo() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_UserProductInfo_get(swigCPtr, this);
	}

	public void setStatusMsg(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_StatusMsg_set(swigCPtr, this, value);
	}

	public String getStatusMsg() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_StatusMsg_get(swigCPtr, this);
	}

	public void setActiveUserID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_ActiveUserID_set(swigCPtr, this, value);
	}

	public String getActiveUserID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_ActiveUserID_get(swigCPtr, this);
	}

	public void setBrokerExecOrderSeq(int value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_BrokerExecOrderSeq_set(swigCPtr, this, value);
	}

	public int getBrokerExecOrderSeq() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_BrokerExecOrderSeq_get(swigCPtr, this);
	}

	public void setBranchID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_BranchID_set(swigCPtr, this, value);
	}

	public String getBranchID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_BranchID_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_InvestUnitID_get(swigCPtr, this);
	}

	public void setAccountID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_AccountID_get(swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_CurrencyID_get(swigCPtr, this);
	}

	public void setIPAddress(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_IPAddress_get(swigCPtr, this);
	}

	public void setMacAddress(String value) {
		thosttraderapiJNI.CThostFtdcExecOrderField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress() {
		return thosttraderapiJNI.CThostFtdcExecOrderField_MacAddress_get(swigCPtr, this);
	}

	public CThostFtdcExecOrderField() {
		this(thosttraderapiJNI.new_CThostFtdcExecOrderField(), true);
	}

}
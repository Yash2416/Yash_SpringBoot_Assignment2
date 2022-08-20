package com.bankapp.model.dto;

import java.math.BigDecimal;

import lombok.Data;
@Data
public class TransferRequest {
	private Integer fromAcc;
	private Integer toAcc;
	private BigDecimal amount;
	public Integer getFromAcc() {
		return fromAcc;
	}
	public void setFromAcc(Integer fromAcc) {
		this.fromAcc = fromAcc;
	}
	public Integer getToAcc() {
		return toAcc;
	}
	public void setToAcc(Integer toAcc) {
		this.toAcc = toAcc;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
}

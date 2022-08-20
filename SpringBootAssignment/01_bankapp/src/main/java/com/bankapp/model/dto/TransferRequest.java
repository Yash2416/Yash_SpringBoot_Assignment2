package com.bankapp.model.dto;

import java.math.BigDecimal;

import lombok.Data;
@Data
public class TransferRequest {
	private Integer fromAcc;
	private Integer toAcc;
	private double amount;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}

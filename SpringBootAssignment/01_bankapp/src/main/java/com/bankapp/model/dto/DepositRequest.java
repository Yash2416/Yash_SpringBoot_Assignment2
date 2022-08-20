package com.bankapp.model.dto;

import java.math.BigDecimal;

import lombok.Data;
@Data
public class DepositRequest {
	private Integer accId;
	private double amount;
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}

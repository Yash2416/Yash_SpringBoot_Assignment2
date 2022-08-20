package com.bankapp.model.dto;

import java.math.BigDecimal;

import lombok.Data;
@Data
public class DepositRequest {
	private Integer accId;
	private BigDecimal amount;
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
}

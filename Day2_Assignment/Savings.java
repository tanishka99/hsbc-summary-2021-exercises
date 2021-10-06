package com.hsbc.beans;

public class Savings extends AccountType{

	private long dailyLimit;
	
	public long getDailyLimit() {
		return dailyLimit;
	}
	public void setDailyLimit(long dailyLimit) {
		this.dailyLimit = dailyLimit;
	}
	public Savings(int acc_no, long balance, String ifsc_code, long dailyLimit) {
		super(acc_no,balance,ifsc_code);
		this.dailyLimit = dailyLimit;
		
	}
public String display() {
		
		String details = super.display() +" Daily limit: "+ dailyLimit;
		return details;
	}

}

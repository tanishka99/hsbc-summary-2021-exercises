package com.hsbc.beans;

public class AccountType {
	private int acc_no;
	private long balance;
	private String ifsc_code;
	
	public AccountType(int acc_no,long balance, String ifsc_code) {
		this.acc_no=acc_no;
		this.balance=balance;
		this.ifsc_code=ifsc_code;
	}
	public int getAcc_no() {
		return acc_no;
	}
//	public void setAcc_no(int acc_no) {
//		this.acc_no = acc_no;
//	}
	public long getBalance() {
		return balance;
	}
//	public void setBalance(long balance) {
//		this.balance = balance;
//	}
	public String getIfsc_code() {
		return ifsc_code;
	}
//	public void setIfsc_code(String ifsc_code) {
//		this.ifsc_code = ifsc_code;
//	}
	public String display() {
		String details ="Account no: " +acc_no +" Balance: "+balance+ " IFSC Code: "+ ifsc_code;
		return details;
	}
}

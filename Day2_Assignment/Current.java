package com.hsbc.beans;

public class Current extends AccountType {
	private String nomineeName;
	
	public Current(int acc_no, long balance, String ifsc_code, String nomineeName) {
		super(acc_no,balance,ifsc_code);
		this.nomineeName = nomineeName;
		
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	
public String display() {
		
		String details = super.display() +" Nominee name: "+ nomineeName;
		return details;
	}

}

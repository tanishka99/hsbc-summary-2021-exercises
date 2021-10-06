package com.hsbc;

import java.time.LocalDate;

import com.hsbc.beans.Savings;
import com.hsbc.beans.Current;
import com.hsbc.beans.AccountType;

public class TestDisplay {
	public static void main(String[] args) {
		Savings saving = new Savings(567825398,69898,"GK3792",89302);
		Current current = new Current(569604398,184908,"MK3792","liza");
		
		System.out.println("Savings Account Details: " + saving.display());
		System.out.println("Current Account Details: " + current.display());


}
}

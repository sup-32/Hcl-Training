package com.hcl;

public class CurrentAccount {
	private String tinNumber;
	public CurrentAccount()
	{
		
	}
	public CurrentAccount(String accName,String accNo,String bankName,String tinNumber)
	{
		super();
		this.tinNumber=tinNumber;
	}
	public String getTinNumber() {
		return this.tinNumber;
	}
	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	public void display()
	{
		super.display();
		System.out.println("TINNumber:"+tinNumber);
	}

}

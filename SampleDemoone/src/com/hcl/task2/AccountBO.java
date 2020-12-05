package com.hcl.task2;

public class AccountBO {
	public FixedAccount getAccountDetails(String detail)
	{
		String s[]=detail.split(",");
		FixedAccount fixedaccount=new FixedAccount();
		fixedaccount.setAccountnumber(s[0]);
		fixedaccount.setBalance(Double.parseDouble(s[1]));
		fixedaccount.setAccountHolderName(s[2]);
		fixedaccount.setMinimumBalance(Double.parseDouble(s[3]));
		fixedaccount.setLockedPeriod(Integer.parseInt(s[4]));
		return fixedaccount;
		
		
		
	}

}

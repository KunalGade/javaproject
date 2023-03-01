package moblieapplication;

import java.util.Scanner;

public class Deposit {
	int amt=0;
	public int userInput()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter amount to be deposited");
	int amt=sc.nextInt();
	if(amt<=0)
	{
		invalid_transaction depositenegativeerror=new invalid_transaction("invalid deposit amount");
		System.out.println(depositenegativeerror.getMessage());
		userInput();
		
	}
	else
	{
		return amt;
	}
	return amt;
			
	}

}

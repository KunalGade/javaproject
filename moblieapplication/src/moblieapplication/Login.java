package moblieapplication;

import java.util.Scanner;

public class Login {
	int ac_number=123456789;
	int ac_pass=258099;
	int ac,pw;
	public void acceptInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter bank account number");
		ac=sc.nextInt();
		System.out.println("enter password");
		pw=sc.nextInt();
	}
	public void verifiy()throws Exception
	{
		if(ac==ac_number && pw==ac_pass)
		{
			System.out.println("your account is sucessfully login !!!!!");
			Banking_account b=new  Banking_account();
			System.out.println(" ");
			System.out.println("your account balance is"+b.getBalance()+"ruppes");
	        System.out.println(" ");
	        menu m1=new menu();
	        m1.showMenu();
		}
		else
		{
			invalid_transaction loginfalied=new invalid_transaction("invalid login password or data");
		     System.out.println(loginfalied.getMessage());
		     throw loginfalied;
		
		
		}
		
	}

}

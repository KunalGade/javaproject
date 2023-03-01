package moblieapplication;

import java.util.Scanner;

public class menu {
	int selectoption;
	  Banking_account b=new  Banking_account();
	  public void showMenu()
	  {
		  System.out.println("please make your choice");
		  System.out.println("1.deposit an amount");
		  System.out.println("2.withdraw amount");
		  System.out.println("3.check your account balance");
		  System.out.println("enter any key to exit");
		  System.out.println(" ");
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter your choice:");
		  selectoption=sc.nextInt();
		  switch(selectoption)
		  {
		  case 1:
			  System.out.println("enter amount will be deposited");
			  Deposit d=new Deposit();
			  int depamt=d.userInput();
			  b.add(depamt);
			  showMenu();
			  break;
		  case 2:
			  System.out.println("withdraw an amount");
			  int withamt=sc.nextInt();
			  b.withdraw(withamt);
			  showMenu();
			  break;
		  case 3:
			  System.out.println("your account balamce is"+b.getBalance()+"Rupees");
			  System.out.println(" ");
			  showMenu();
			  break;
			  
			  default:
				  System.out.println("account logout sucessfully !!!!!");
				  System.exit(0);
				  break;
			  
		  }
	  }

		
	}
	  



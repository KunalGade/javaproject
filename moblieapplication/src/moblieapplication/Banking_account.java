package moblieapplication;



public class Banking_account {
	int amount = 5000;
	public void initiate()
	{
		Login l=new Login();
		try
		{
			l.acceptInput();
			l.verifiy();
		}
		catch(Exception e)
		{
			try
			{
				l.acceptInput();
				l.verifiy();
			}
			catch(Exception f)
			{
	
			}
		}
	}
      public int getBalance()
      {
    	  return amount;
      }
	public void add(int amt)
       {
    	   amount=amount+amt;
    	   System.out.println("amount deposited sucessfully");
    	   System.out.println(" ");
    	   System.out.println("amount deposited : " +amount);
    	   System.out.println(" ");
       }
	public void withdraw(int amt)
	{
		System.out.println(" ");
		if(amount<amt)
		{
			invalid_transaction invalidwithdraw=new invalid_transaction("insufficent fund");
			System.out.println(invalidwithdraw.getMessage());
		}
		else
			{
			amount=(amount-amt);
			System.out.println("please collect your amount:"+amt+"rupees");
			System.out.println(" ");
			System.out.println("avaliable balance:"+amount);
			System.out.println(" ");
			}
			
		}
	}


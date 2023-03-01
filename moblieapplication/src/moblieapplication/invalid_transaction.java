package moblieapplication;

public class invalid_transaction extends Exception
{
	String errorMessage;
	public invalid_transaction(String Message)
	{
		errorMessage=Message;
	}
	public String getMessage()
	{
		return errorMessage;
	}

}

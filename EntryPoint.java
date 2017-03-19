package com.adamgardner.code;

public class EntryPoint
{

	public static void main(String[] args)
	{
		while (true)
	    {
	        try
	        {
	            startBatch();
	            Thread.sleep(2000);
	        }
	        catch (Exception e) {}
	    }
	}
	 
	private static void startBatch()
	{
	   System.out.println("Starting Batch Job");
	   doThis();
	}
	
	private static void doThis()
	{
		System.out.println("Now doing this....");
		System.out.println("------------------");
	}

}

class Test 
{
	Test()
	{
		System.out.println("0 arg const");
	}
	
     Test (int a)
	{
	
	    System.out.println("1 arg const");
	}

	 Test (int a, int b)
	{
		 System.out.println("2 arg const");
	}

	{
	    System.out.println("instance block");
	}
	
	public static void main(String[] args) 
	{
		new Test();
		new Test(5);
		new Test(5, 10);
	}
}

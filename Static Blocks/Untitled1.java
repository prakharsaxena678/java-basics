class Test 
{
	{
		System.out.println("instance block 1");
	}
	
	{
		System.out.println("instance block 2");
	}
	
	static
	{
	    System.out.println("static block 1");
	}
	
	static
	{
	    System.out.println("static block 2");
	}
	
	Test()
	{
        System.out.println("0 arg cons");
	}
	
	Test(int a)
	{
        System.out.println("1 arg cons");
	}

	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	    new Test();
		new Test(5);
	}
}

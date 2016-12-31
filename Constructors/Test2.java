class Test2
  
{
     Test2()
	{
		 this(10);
		 System.out.println("o arg cons");
	}
     Test2(int a)
	{
		 this(10,20);
		 System.out.println("1 arg cons");
	}
	 Test2(int a, int b)
	{
		 System.out.println("2 arg cons");
	}
	
	public static void main(String[] args) 
	{
		Test2 t = new Test2();
	}
}

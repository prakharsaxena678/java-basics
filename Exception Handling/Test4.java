class Test4 
{
	 
	void m1()
	{
		m2();
	}
    void m2()
	{ 
	   m3();
	}
	void m3()
	{
	try
	{
	  System.out.println(10/0);
	}
	catch (ArithmeticException e)
	{
	  System.out.println(e.toString());
	}
	}

public static void main(String[] args)
	{
       new Test4().m1(); 
    }
}

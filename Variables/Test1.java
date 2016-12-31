class Test1 
{
	static int a = 1000;
	static int b = 2000;
	public static void main(String[] args) 
	{
		System.out.println(Test1.a);
		System.out.println(Test1.b);
	    Test1 t = new Test1();
		t.m1();
	}
    void m1()
	{
		System.out.println(Test1.a);
		System.out.println(Test1.b);
    }
	}

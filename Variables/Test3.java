class Test3 
{
	int a=10;
	int b=20;
	static int c=30;
	static int d=40;
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(Test3.c);
		System.out.println(Test3.d);
	}
	static void m2()
	{
		Test3 t = new Test3();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(Test3.c);
		System.out.println(Test3.d);
	}

    public static void main(String[] args) 
	{
		Test3 t= new Test3();
		t.m1();
		Test3.m2();
	}
}

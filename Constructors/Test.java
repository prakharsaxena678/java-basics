class Test 
{
	void m1()
	{
	System.out.println("m1 method");
	}
    //used defined constructors
	Test()
	{
		System.out.println("0-arg-cons");
	}
	Test(int a)
	{
		System.out.println("1-arg-cons");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Test t = new Test();
		Test t1 = new Test(10); 
		t.m1();
	}
}

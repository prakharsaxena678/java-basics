class Test3
  
{
	void m1()
	{
		m2();  //instance method calling
		System.out.println("m1 method");
        m2();
	}
	void m2()
	{
		m3(10);
		System.out.println("m2 method");

	}
	void m3(int a)
	{
		
		System.out.println("m3 method");

	}

	public static void main(String[] args) 
	{
		Test3 t = new Test3();
		t.m1();
		t.m2();
	}
}

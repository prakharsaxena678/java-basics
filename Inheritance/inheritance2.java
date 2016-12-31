class Parent
{
	void m1()
	{
		System.out.println("parent m1 method");
	}

}
class child extends Parent
{
	void m1()
	{
		System.out.println("child m1 method");
	}
    void m2()
	{
		m1();
		super.m1();
	}
    public static void main(String[] args)
	{
		new child().m2();
	}

}

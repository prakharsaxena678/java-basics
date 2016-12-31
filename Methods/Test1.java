class Test1 
{
	void m1(int a, char ch) //Local Variable
	{
	System.out.println("m1 method");
	System.out.println(a);
	System.out.println(ch);
	}
	
	static void m2(String str, double d)
	{
	System.out.println("m2 method");
	System.out.println(str);
	System.out.println(d);
	}
	public static void main(String[] args) 
	{
	Test1 t = new Test1();
	t.m1(10, 'f');
	Test1.m2("dfr", 8.9);
	}
}

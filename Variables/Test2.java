class Test2 
{
	int a = 10;
	int b = 20;

    static void m1() 
	{
	Test2 t= new Test2();
	System.out.println(t.a);
	System.out.println(t.b);
		
	}//object is destroyed after method completion
    static void m2()
    {
	Test2 t= new Test2();
	System.out.println(t.a);
	System.out.println(t.b);
		
	}
    public static void main(String[] args) 
	{
    
	Test2.m1();
	Test2.m2();
	
	}
}

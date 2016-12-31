class Test 
{
    int a=100;
	int b=200;
	//static method
	public static void main(String[] args) //main method
	{//static area
		Test t = new Test();
		System.out.println(t.a);
        System.out.println(t.b);

	}
    //instance method
	void m1()
    {//instance area
		System.out.println(a);
		System.out.println(b);

	}
	}

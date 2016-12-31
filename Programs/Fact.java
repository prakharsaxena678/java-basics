class fact 
{
	void m1(int n)
	{
	  int i, f=1;
	  for(i=1;i<=n;i++)
		{
	      f = f*i;
	    }
     System.out.println("The factorial of the number is " +f);
	}

    public static void main(String[] args) 
	{
		fact t = new fact();
		t.m1(5);
	}

}
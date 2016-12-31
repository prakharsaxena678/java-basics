class prime 
{
	void m1(int n)
	{
	 int i,j=0;
	 for(i=2;i<n;i++)
		{
	      if(n%i==0)
		  j=j+1;
	    }
	  if(j==0)
        System.out.println("Number is prime");
	  else
		  System.out.println("Number is not prime");
	}
	
	public static void main(String[] args) 
	{
	  prime p=new prime();
	  p.m1(12);
	}
}

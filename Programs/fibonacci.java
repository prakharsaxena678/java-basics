class fibonacci 
{
	public static void main(String[] args) 
	{
		int i, n1=0, n2=1, n3, n=10;
        
		System.out.println(n1+"  "+n2);
		
		for(i=2;i<n;i++)
		{
		  n3 = n1+n2;
		  System.out.println("  "+n3);
		  n1=n2;
		  n2=n3;
		}
		
	}
}

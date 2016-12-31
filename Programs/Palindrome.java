class palindrome 
{
	void m1(int n)
	{
	int i, r, temp, sum = 0;
	temp = n;
	while(n>0)
	   {
	    r = n%10;
	    sum = (sum*10)+r;
	    n = n/10;
	   }
	if(sum==temp)
		
		System.out.println("Palindrome Number);
        
	else
		
	    System.out.println("Not a Palindrome Number);
	    
	}
	public static void main(String[] args) 
	{
		palindrome t = new palindrome();
		t.m1(141);
	}
}

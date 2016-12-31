class ss 
{
	public static void main(String[] args) 
	{
		int a[] = {23,9,54,37,11};
	    int i;
        for(i=0;i<(a.length-1);i++)
		{
			int index = i;
			for(int j=i+1;j<a.length;j++)
			{
			  if(a[j]<a[index])
				  index=j;
			}
        int smallerNumber=a[index];
		a[index]=a[i];
        a[i]=smallerNumber;
		}
    
	   for(i=0;i<a.length;i++)
		{
		   System.out.println(a[i]+"  ");
	    }
	}

}

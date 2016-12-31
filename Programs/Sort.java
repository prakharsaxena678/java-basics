class bubblesort 
{
	public static void main(String[] args) 
	{
		int a[] = {41,789,183,913,16};
		int n=a.length;
		int temp =0;
		int i,j;
		for(i=0;i<n;i++)
		{
		  for(j=1;j<n;j++)
			{
		      if(a[j]<a[j-1])
				  temp=a[j-1];
			      a[j-1]=a[j];
				  a[j]=temp;
			}
			
		}	
	    for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"   ");
		}
	}
}

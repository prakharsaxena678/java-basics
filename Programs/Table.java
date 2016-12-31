class apples 
{
	public static void main(String[] args) 
	{
		System.out.println("Index\tvalue1\tvalue2");
        int bucky[] = {64,98,14,2};
		
		for(int counter=0;counter<(bucky.length)-1;counter++)
		{
		   System.out.println(counter +"\t"+ bucky[counter] +"\t"+ bucky[counter+1]);
		   counter = counter+1;
		}
	}
}

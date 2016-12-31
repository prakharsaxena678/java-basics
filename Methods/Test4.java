class Test4
  
{
	int x = 100;
	int y = 200;

	void add(int x,int y)  //Local Variable
	{
		
		System.out.println(x+y);  //Local variable
		System.out.println(this.x+this.y);
        
	}


	public static void main(String[] args) 
	{
		Test4 t = new Test4();
		t.add(1000,2000);
		
	}
}

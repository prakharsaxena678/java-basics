class abc
{
	void mro()
	{
	    System.out.println("sleeping mode");
		Thread.sleep(3000);
		System.out.println("sleeping mode");
	}
	void moffice()
	{
	    mro();
	}
	
	void eseva()
	{
	   moffice();
	}
	
	public static void main(String[] args) 
	{
		abc t = new Test();
		t.eseva();
	}
}

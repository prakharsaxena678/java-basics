class Test5
{
	void mro() throws InterruptedException
	{
	    System.out.println("sleeping mode");
		Thread.sleep(3000);
		System.out.println("sleeping mode");
	}
	void moffice() throws InterruptedException
	{
	    mro();
	}
	
	void eseva() throws InterruptedException
	{ 
	   moffice();
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		Test5 t = new Test5();
		t.eseva();
	}
}

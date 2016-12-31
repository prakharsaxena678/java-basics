class Parent 
{
	Parent()
	{
		System.out.println("parent class 0-arg cons");
	}
}	
class child extends Parent
{
    child()
    {
        this(10);
		System.out.println("child class 0-arg cons");
	}
    child (int a)
	{
	    super();
		System.out.println("child class 1-arg cons");
	}


	public static void main(String[] args) 
	{
		new child();
		
	}
}

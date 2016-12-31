class Parent 
{
	int a = 10;
	int b = 20;
}
	class child extends Parent
	{
		int a = 100;
		int b = 200;
		void add(int a,int b)  // Local variables
		{
			System.out.println(a+b);  // Local
			System.out.println(this.a+this.b);  // Current
			System.out.println(super.a+super.b);  // Super
		}
	public static void main(String[] args) 
	{
		new child().add(1000,2000);
	}
}

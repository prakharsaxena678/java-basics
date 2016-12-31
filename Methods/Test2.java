class X{}
class Emp{}
class Y{}
class Student{}
class Test2

{
	void m1(X x, Emp e) 
	{
	System.out.println("m1 method");
	
	}
	
	static void m2(Y y, Student s)
	{
	System.out.println("m2 method");
	
	}
	public static void main(String[] args) 
	{
	 Test2 t = new Test2();
	 X x = new X();
	 Emp e = new Emp();
	 t.m1(x,e);
	 
	 Y y = new Y();
	 Student s= new Student(); 
	 Test2.m2(y, s);

	}
}

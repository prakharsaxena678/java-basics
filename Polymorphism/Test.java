class Animal
{
}
class Dog extends Animal 
{
}

class Parent 
{   
	Animal marry()
	{
	   System.out.println("b class car");
       return new Animal();	
	}
}

class child extends Parent
 {
		Dog marry()
		{
		System.out.println("a class car");
		return new Dog();
		}
	
	
	public static void main(String[] args) 
	{
		new child().marry();
	}

}
package Inheritance;

public class Dog extends Animal {
	public void type()
	{
		System.out.println("The child class is dog");
	}
	public static void main (String arg[])
	{
		Dog obj= new Dog();
				obj.type();
				obj.display();
	}
	
	
	

}

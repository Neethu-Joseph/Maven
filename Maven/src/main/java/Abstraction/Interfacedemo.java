package Abstraction;

public class Interfacedemo implements Interface {
	public void display()
	{
		System.out.println("Interface method1");
	}
	public void print()
	{
		System.out.println("Interface method2");
	}
	public void demo()
	{
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		Interfacedemo obj=new Interfacedemo();
		obj.display();
		obj.print();
		obj.demo();
		
		
	}

}

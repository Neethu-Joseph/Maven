package Abstraction;

public class Child extends AbstractClass {
	public void display()
	{
		System.out.println("Abstract method implementation");
		
	}
	public void print()
	{
		System.out.println("Child class method");
		
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.print();
		obj.show();
	}

}

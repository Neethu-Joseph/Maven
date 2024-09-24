package Superkey;

public class Child extends Parent {
	String color="White";
	String b;
	public Child(String breed)
	
	{
		super("Rot");
		System.out.println("The child class constructor");
		System.out.println("The breed is-"+breed);
		
		}
	public void display()
	{
		System.out.println("The child class method");
		System.out.println("colour-"+color);
		System.out.println(super.color);
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj1=new Child("Bull");
		System.out.println(obj1.color);
        obj1.display();
	}

}

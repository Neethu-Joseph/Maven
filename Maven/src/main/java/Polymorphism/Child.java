package Polymorphism;

public class Child extends Parent {
	
	public void demo(String name, String place)
	{
		super.demo("pala","kerala");
		System.out.println("polymorphism");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
				obj.demo("Neethu","Kottayam");

	}

}

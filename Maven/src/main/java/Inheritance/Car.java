package Inheritance;

public class Car extends SingleInheritance {
	String model="Sedan";
			public void display()
			{
		System.out.println("Sports car");
			}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.details();
		obj.display();
		System.out.println("Speed is"+obj.speed);
		System.out.println("model is"+obj.model);
		
		

	}

}

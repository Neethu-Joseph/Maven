package Aggregation;

public class Student {
	String name;
	int age;
	Address add;
	public Student(String name,int age,Address add) {
		this.name=name;
		this.age=age;
		this.add=add;
		
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(add.housename);
		System.out.println(add.houseno);
		System.out.println(add.pincode);
		System.out.println(add.city);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address obj1=new Address("Chakkumcal",12,686582,"Kottayam");
		Student obj2=new Student("Neethu",29,obj1);
		obj2.display();
		

	}

}

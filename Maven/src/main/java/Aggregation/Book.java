package Aggregation;

public class Book {
	String title;
	String category;
	int price;
	Author auth;
	
	public Book(String title,String category,int price,Author auth) {
		this.title=title;
		this.category=category;
		this.price=price;
		this.auth=auth;
	}
	public void display() {
		System.out.println(title);
		System.out.println(category);
		System.out.println(price);
		System.out.println(auth.name);
		System.out.println(auth.place);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author obj1=new Author("Benyamin","Kerala");
		Book obj2=new Book("Aadujeevitham","Novel",299,obj1);
		obj2.display();
		

	}

}

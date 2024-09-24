package Inheritance;

public class Son extends Father{
public void sondisplay()
{
	System.out.println("The son class method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son obj=new Son();
		obj.display();
		obj.fathdisplay();
		obj.sondisplay();
		
	Daughter obj1= new Daughter();
	obj1.daughtdisplay();
		
		

	}

}

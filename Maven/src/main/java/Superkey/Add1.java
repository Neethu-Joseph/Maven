package Superkey;

public class Add1 extends Add {
	int div;
	public void div()
	{
		super.addition(45,15);
		if(sum%10==0)
		{
			System.out.println("Divisible by 10");
		}
		else
			System.out.println("Not divisible by 10");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add1 obj=new Add1();
				obj.div();

	}

}

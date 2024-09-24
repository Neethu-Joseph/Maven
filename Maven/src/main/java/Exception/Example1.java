package Exception;

public class Example1 {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int sum=a+b;
		try {
			int c=sum/0;
			System.out.println("Try Block");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
System.out.println("Rest of the code");
	}

}

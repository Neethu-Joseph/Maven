package Polymorphism;

public class Hockey extends Sports {
	
		public void play()
		{
			System.out.println("The game Hockey");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hockey obj1 =new Hockey();
		Sports obj2=new Sports();
		Football obj3=new Football();
		Cricket obj4=new Cricket();
		obj1.play();
		obj2.play();
		obj3.play();
		obj4.play();
		
		
		

	}

}

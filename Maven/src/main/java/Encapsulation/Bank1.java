package Encapsulation;

public class Bank1 {
	private int pin;

	public void getPin() {
		System.out.println("Given pin is "+pin);
	}
	

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void display()
	{
		if(pin==1001||pin==1234||pin==1212) 
		{
			System.out.println("Given pin is valid");
		}
		else
		{
			System.out.println("Invalid pin");
		}
	}
	

}

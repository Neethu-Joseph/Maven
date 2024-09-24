
public class Stringeg {

	public static void main(String[] args) {
		
		String s="malayalam";
		//System.out.println("The word is"+s;)
		String r="";
		
	for(int i=s.length()-1; i>=0;i--)
	{
		r+=s.charAt(i);
	}
	if (s.toLowerCase().equals(r.toLowerCase()))
	{
	System.out.println (s="is a Palindrome");
	}
	
	else
	{
		
		System.out.println (s="is not a Palindrome");	

	}

}
}

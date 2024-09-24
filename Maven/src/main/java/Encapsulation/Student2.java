package Encapsulation;

public class Student2 {
	private String name;
	private int no;
	private String dep;
	
	public void setter(String name,int no,String dep)
	{
		this.name=name;
		this.no=no;
		this.dep=dep;
		
	}
	public void getter()
	{
		System.out.println(name);
		System.out.println(no);
		System.out.println(dep);
		
		
	}
	

}

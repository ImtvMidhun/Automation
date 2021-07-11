package Pages;

public class inherited extends overriding {
	
	
	public void parentclass() {
		
		
		System.out.println("sub class method");
	}
	
	
	public static void main(String args[])  {
		
		
		inherited ov=new inherited();
		ov.parentclass();
	}

}

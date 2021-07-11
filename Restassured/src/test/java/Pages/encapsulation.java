package Pages;

public class encapsulation {

	private int a;
	
	int data() {
		
		
		return a;
	}
	
	public void getters(int a) {
		
		this.a=a;
	}
	
	
		
		
		
	
	public static void main (String args[]) {
		
	encapsulation obj=new encapsulation();
	obj.getters(4);
	
	System.out.println(obj.data());
	
		
	}	
	
}


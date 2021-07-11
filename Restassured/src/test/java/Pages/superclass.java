package Pages;

abstract class superclass {
	
	abstract void ok();
	
		
}

class rect extends superclass {
	
	
	public void ok() {
		
		System.out.println("print ok");
		
	}
	
}

class mainclass {
	
	
	public static void main(String args[]) {
		
	rect obj=new rect();
	obj.ok();
}
}
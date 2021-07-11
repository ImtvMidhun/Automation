package Pages;

public class methodloading {
	
	public void data(int a,String b) {
		
		
		System.out.println(a+" "+b);
	}
	
	public void data(String a,String b) {
		
		
		System.out.println(a+" "+b);
	}

	public static void main(String args[]) {
		
		
		methodloading ok=new methodloading();
		ok.data(5, "one");
		ok.data(6, "three");
	}

}

package Pages;

public class multi {

	public static void main(String args[]) {
		
		
		int n=5;
		for(int i=0;i<n;i++) {
			
			
			threadrun1 obj=new threadrun1();
			obj.start();
		}
	}
}

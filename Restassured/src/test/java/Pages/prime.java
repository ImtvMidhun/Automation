package Pages;

public class prime {
	
	public static void main(String args[]) {
		
		
		int a=7;
		boolean flag=false;
		for(int i=2;i<a/2;i++) {
			
			
			if(a%i==0) {
				
				flag=true;
				
			}
		}
			if(flag==true) {
				
				
				System.out.println("non prime number");
			}
			else {
				
				System.out.println("prime number");
			}
				
				
		
		
	}

}

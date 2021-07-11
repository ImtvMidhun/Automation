package Pages;

public class evenodd {
	
	public static void main(String args[]) {
		
		
		int num=13434534;
		int odd=0;
		int even=0;
		while(num>0) {
			
			
			int rem=num%10;
			if(rem%2==0 ) {
				
				even=even+1;
			}
			else
			{
				odd=odd+1;
			}
			num=num/10;
			
		}
		System.out.println("even is "+even+ " odd is "+odd);
	}

}

package Pages;

public class maxandmin {
	
	public static void main(String args[]) {
		
		
		int ar[]= {10,56,789,4,34,76};
		int max=ar[0];
		int min=ar[1];

		
		for(int i=1;i<ar.length;i++) {
			
			
			if(max<ar[i]) {
				
				max=ar[i];
			}
			
		}
		System.out.println("max is "+max);
		
	
	
	for(int i=1;i<ar.length;i++) {
		
		
		if(min>ar[i]) {
			
			min=ar[i];
		}
		
	}
	System.out.println("min is "+min);
	}
}

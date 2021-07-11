package Pages;

public class missing {
	
	public static void main(String args[]) {
		
		
		int arr[]= {3,4,5,6,8};
		
		int size=arr.length;
		//int num=arr[0];
		for(int num=arr[0];num<=arr[size-1];num++) {
			
			for(int j=0;j<=arr.length-1;j++)
			
			
			if(num==arr[j]) {
				
				System.out.println("number "+num);	
				
			}
			else
			{
				
				System.out.println("missing number "+num);
			}
		}
	}

}

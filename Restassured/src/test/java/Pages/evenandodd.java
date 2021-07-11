package Pages;

public class evenandodd {

	public static void main(String args[]) {
		
		
		int arr1[]= {4,5,6};
		int arr2[]= {4,5,6};
		int count =0;
		
		int size1=arr1.length;
		int size2=arr2.length;
		if(size1==size2) {
			
		
		for(int i=size1-1;i>=0;i--) {
			
			
			
			if(arr1[i]==arr2[i]) {
				
				count=count+1;
				
			}
			
			
		}
		
		if(count==size1) {
			
			
			System.out.println("equal");
		}
		else
		{
			
			System.out.println("not equal");
		}
		
		
		
	}
}
}

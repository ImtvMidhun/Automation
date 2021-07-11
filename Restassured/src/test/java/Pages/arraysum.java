package Pages;

public class arraysum {
	
	public static void main(String args[]) {
	int arr[]= {4,7,3,2};
	
	int size=arr.length;
	
	int sum=0;
	for(int i=size-1;i>=0;i--) {
		
		sum=sum+arr[i];
		System.out.println(sum);
		
	}
	
	System.out.println(sum);
	}

}

package Pages;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class arrasort {

	public static void main(String args[]) {
		
		
		
		int arr[]= {56,78,1,34,2};
		int m=arr.length;
		int sum;
		
		
		for(int i=0;i<m-1;i++) {
			
			
			for(int j=0;j<m-1;j++) {
				
				if(arr[j]>arr[j+1]) {
				
				
				sum=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=sum;
			}
			}
			System.out.println(Arrays.toString(arr));
			//Arrays.sort(arr.toString(),Collections.reverseOrder());
		}
	}
}

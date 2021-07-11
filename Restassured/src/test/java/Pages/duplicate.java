package Pages;

import java.util.HashSet;

public class duplicate {
	
	public static void main(String args[]) {
		
	int arr[]= {3,5,4,78,98,1,3,5};
	
	int h=arr.length;
	
	for(int i=0;i<h;i++) {
		
		for(int j=i+1;j<h;j++) {
		
		
		if(arr[i]==arr[j]) {
			
			
			System.out.println("duplicate is " + arr[i]);
		}
		}
	}
	
	HashSet<Integer> vt=new HashSet<Integer>(); 
	
	
	for(int m:arr)
		
		if(vt.add(m)==false) {
			
			
			System.out.println("duplicate is "+m);
		}
		
		
		
	
	
	
	}
	
	

}

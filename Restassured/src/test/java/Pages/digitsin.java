package Pages;

public class digitsin {
	
	public static void main(String args[]) {

	int num=3454;
	int count=0;
	
	while(num>0) {
		
		num=num/10;
		count=count+1;
		//System.out.println("count is "+count);
		
	}
	System.out.println("count is "+count);
}
}

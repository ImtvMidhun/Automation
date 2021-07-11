package Pages;

import java.util.Scanner;

public class revrsenumber {
	
	public static void main(String[] args) {
		
		Scanner k=new Scanner(System.in);
		System.out.println("enter number");
		
		int num=k.nextInt();
		/*int reversenum=0;
		while(num!=0) {
			
		
		//num=num%10;
		System.out.println("number is "+num);
				
		reversenum=reversenum*10+num%10;
		num=num/10;
		System.out.println("reverse is "+reversenum
				);
		}*/
		
StringBuffer mn=new StringBuffer(String.valueOf(num));
System.out.println(mn.reverse());

}
}

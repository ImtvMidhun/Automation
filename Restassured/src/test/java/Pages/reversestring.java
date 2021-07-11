package Pages;

public class reversestring {
	
	public static void main(String args[]) {
		
		String s= "midhun";
		int length=s.length();
		String m=null;
		
		for(int i=length-1;i>=0;i--) {
			
			m=m+s.charAt(i);
		}
		System.out.println(m);
		
	}

}

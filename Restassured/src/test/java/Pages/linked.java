package Pages;

import java.util.LinkedList;

public class linked {
	
	public static void main(String args[]) {
		
		
		LinkedList<String> data=new LinkedList<String>();
		
		data.add("one");
		data.add("two");
		data.add("one");
		
		for(String mn:data)
			
			System.out.println(mn);
		
	}

}

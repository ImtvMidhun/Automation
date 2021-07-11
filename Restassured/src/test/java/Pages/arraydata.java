package Pages;

import java.util.ArrayList;
import java.util.Iterator;

/*public class arraydata {
	
	public static void main(String args[]) {
	
	ArrayList<String> data=new ArrayList<String>();
	
	data.add("one");
	data.add("two");
	
	
	for(String ok:data)
		
		System.out.println(ok);
	
	}
}*/

public class arraydata {
	
	public static void main(String args[]) {
	
	ArrayList<Object> data=new ArrayList<Object>();
	
	data.add("one");
	data.add("two");
	data.add("one");
	data.add(1);
	
	
	Iterator<Object> rtr=data.iterator();
		
		
	while(rtr.hasNext()) {
		
		System.out.println(rtr.next());
	}
	
	
	}
}

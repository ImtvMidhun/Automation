package Pages;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map {

	public static void main(String args[]) {
		
		
		Map<Integer, String> maping=new HashMap<Integer, String>(); {
			
			
			maping.put(2, "one");
			maping.put(3, "two");
			maping.put(2, "three");
			maping.put(new Integer(1),"ok");
		}
		
		for(Map.Entry<Integer, String> ok:maping.entrySet()) {
			
			
			System.out.println(ok.getKey());
			System.out.println(ok.getValue());
		}
		

		
	}
}

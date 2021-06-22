package Pages;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.codehaus.groovy.classgen.ReturnAdder;
import org.json.simple.JSONObject;

public class postdata {
	
	public JSONObject bodydata() {
		
		JSONObject convert;
		Map<String, Object> insert=new HashedMap<String, Object>(); {
			
			insert.put("email", "eve.holt@reqres.in");
			insert.put("password","pistol");
			
			 convert=new JSONObject(insert);
			 
			 

		}
		return convert;
		
	}

}

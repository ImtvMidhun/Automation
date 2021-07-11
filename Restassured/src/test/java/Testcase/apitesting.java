package Testcase;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

import static io.restassured.RestAssured.*;


import org.apache.commons.collections4.map.HashedMap;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.postdata;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;



public class apitesting {
	
	
	String token="eyJraWQiOiJDbzlmNjZFZmRSRFVFeEQ0bWcwNnl2dHNQZk9nT01DWFlqTHgwRGE4S0UwIiwiYWxnIjoiUlMyNTYifQ.eyJ2ZXIiOjEsImp0aSI6IkFULlV6RWFCMVVuaHFXVllTTEx0ZElPelUxLXNaSEVLQV9IUDRzcFA1NElQVmMub2FyOWgxNmpjdGRRdUFyT040eDYiLCJpc3MiOiJodHRwczovL2xvZ2luLmNvbnNhbGx5LmNvbS9vYXV0aDIvYXVzZXFzMXlvNEdlQzFQWGw0eDYiLCJhdWQiOiJhcGk6Ly9kZWZhdWx0IiwiaWF0IjoxNjIzOTE5NjMyLCJleHAiOjE2MjQwMDYwMzIsImNpZCI6IjBvYTFkemxiYjdDMkVuVW9zNHg3IiwidWlkIjoiMDB1MWp5NjYyeWFMYmxZZ1Q0eDciLCJzY3AiOlsib2ZmbGluZV9hY2Nlc3MiLCJvcGVuaWQiLCJwcm9maWxlIl0sInN1YiI6Im1pc3Rha2VAeW9wbWFpbC5jb20ifQ.P0tUtuK8ZYYCrwL0kHGpGL9STZmGCx7C2uzKPZUsMWVya8Yc2oYHbOE8nfETp4iD6rTjVedIsTuB3kDslYx5Jr3mHbxgunKrU31eugU3FIG5yBz0jOZNg0LuznUkpIXS_FUz7lz4rZfSr3x50u7CbT8-eqv7ePlKJQMZPc2GUbSoP_mGBxx_t2mMzl8jiplyKhYKCTmK5lgJvpf-j0NMpQipUPi-FYULazljS-wwGE4k7ibzXw6JzPXsG5xdMCxobxIe-ac1vcM_r_xwJfEdpw-14-fHJtzzXC-iy61P-sxXxzcatpL4PlLMy5FzVSHPIe3m0-PZhSnUtdEMf30P3w";
	
	@Test(enabled=false)
	public void get() {
		

		
		RequestSpecification request=RestAssured.given().baseUri("https://dev.consally.com/api/mentoring").header("Authorization", "Bearer "+token).header("device","mobile");
		
		Response get=request.request(Method.GET,"/mentors?limit=20");
		
		ResponseBody body1=get.getBody();
		body1.prettyPrint();

		
		Assert.assertEquals(200, get.getStatusCode());
		Headers count=get.getHeaders();
		//System.out.println(count);
		int size=count.asList().size();
		System.out.println(size);
;
		
		
		String bodydata=get.getBody().asString();
		
		List<String> resIDs = get.jsonPath().get("Docs");
        System.out.println("Retrieved IDs from Response : " + resIDs);
        System.out.println("ArraySize for IDs from Response : " + resIDs.size());
		//bodydata.length();
		System.out.println(bodydata.length());
		
		
		/*ArrayList<String> input=new ArrayList<>();
		input.add("_id");
		input.add("fullname");
		input.add("oktaId");
		input.add("companyName");
		input.add("jobTitle");
		input.add("location");
		
		for(String fetch:input) {
			
		System.out.println(fetch);
		Assert.assertTrue(bodydata.contains(fetch));
		}*/
		
	}
	
	
	@Test(enabled=false)
	public void put() {
		
		
		Map<String, Object> insert=new HashedMap<String, Object>(); {
			
			insert.put("name", "midhun");
			insert.put("job","qa");
			
			 JSONObject convert=new JSONObject(insert);
			
			System.out.println(convert);
			
		
		
		RequestSpecification request=RestAssured.given().baseUri("https://reqres.in/api").header("Content-Type","application/json").body(convert.toJSONString());
		
		Response value=request.request(Method.POST,"/register");

		
		int statuscode=value.getStatusCode();
		org.testng.Assert.assertEquals(statuscode,201);
		
		//value.prettyPrint();
		
		String bodydata=value.getBody().asString();
		
		ArrayList<String> input=new ArrayList<>(); 
			
		input.add("name");
		input.add("job");
		input.add("id");
		input.add("createdAt");
		
		for(String fetch:input) {
			
			System.out.println(fetch);
			Assert.assertTrue(bodydata.contains(fetch));
			
		
		}
		
		}
		
	}
	
	@Test(enabled=false)
	public void register() throws UnsupportedEncodingException {
		

		postdata obj=new postdata();
		RequestSpecification request=RestAssured.given().baseUri("https://reqres.in/api").header("Content-Type","application/json");
		
		
		Response value=request.request(Method.POST,"/register");
		
		//System.out.println("Response is "+value);
		
		int statuscode=value.getStatusCode();
		//value.prettyPrint();
		String bodydata=value.getBody().asString();
		System.out.println("Response is "+bodydata);
		
		org.testng.Assert.assertEquals(statuscode,400);
		Assert.assertTrue(bodydata.contains("Missing email or username"));
		
		RequestSpecification request2=request.body(obj.bodydata().toJSONString());
		
		
		Response value2=request2.request(Method.POST,"/register");
		int statuscode2=value2.getStatusCode();
		Assert.assertEquals(200, statuscode2);
		value2.prettyPrint();
		
		System.out.println("token is "+value2.path("token"));   
		
	}
	
	@Test
	public void getsomedata() {
		
		
		RequestSpecification rmt=RestAssured.given().baseUri("http://reqres.in").header("Content-Type","application/json");
		
		Response data=rmt.request(Method.GET,"/api/unknown/2");
		
		//String convert=data.getBody().asString();
		
		JsonPath ext=data.getBody().jsonPath();
		
		//String taken=data.getBody().prettyPrint();
		
		System.out.println(ext.get("data.id"));
		
		//JsonPath mn=ext.get("data");
		
		//System.out.println(mn.get("id"));
		
		
	}

}

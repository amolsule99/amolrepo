package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static  io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.matcher.RestAssuredMatchers.*;

//we make it as static to use restassured methods directly
public class GetAndPostExamples
{
	//@Test
    public void testGet()
    {
        	baseURI="https://reqres.in";
        	
        	given().
        	get("api/users?page=2").
        	then().
        	statusCode(200).
        	body("data[4].first_name",equalTo("George")).
        	body("data.first_name",hasItems("George","Rachel"));
     }
	
	@Test
	public void testPost()
	{
		Map<String,Object> map=new HashMap<String,Object>();
		
		//IN Map <Key,Value> Key always String and Value may me varry so 
		//take value as object,so it will contain any type of data
		
		/*map.put("name", "raghav");
		map.put("job","teacher");
		
		System.out.println(map);*/
		
		JSONObject request=new JSONObject();
		request.put("name", "raghav");
		request.put("job","teacher");
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in/api";
		  given().header("Content-Type","application/json").
		  contentType(ContentType.JSON).
		  accept(ContentType.JSON).
		  body(request.toJSONString()).
		when().
		   post("/users").
		then().
		   statusCode(201).
		   log().all();
	}
}

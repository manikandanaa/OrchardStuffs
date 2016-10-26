package json;

import org.json.simple.JSONObject;

public class JsonExample1
{    
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{    
		JSONObject obj=new JSONObject();    
		obj.put("name","manikandan"); 
		obj.put("age",new Integer(21));    
		obj.put("salary",new Double(27000));    
		System.out.print(obj);    
	}
}    


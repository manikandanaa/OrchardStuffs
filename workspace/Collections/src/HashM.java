import java.util.HashMap;
import java.util.Map.Entry;


public class HashM 
{
public static void main(String args[])
{
	HashMap<Integer, String> map=new HashMap<Integer, String>();
	
	
	map.put(5, "FIVE");
	map.put(6, "SIX");
	map.put(1, "ONE");
	map.put(2, "TWO");
	map.put(3, "THREE");
	map.put(4, "FOUR");
	map.put(7, "SEVEN");
	map.put(8, "EIGHT");
	
	String text = map.get(4);
	System.out.println(text);
	
	for(Entry<Integer, String> entry:map.entrySet())
	{
		int key=entry.getKey();
		String value=entry.getValue();
		
		System.out.println(key +":" +value);
	}
}
}
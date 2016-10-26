import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class SortMap 
{
public static void main(String args[])
{
	HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
	LinkedHashMap<Integer, String> linkedhashMap=new LinkedHashMap<Integer, String>();
	TreeMap<Integer, String> treeMap=new TreeMap<Integer, String>();
	
	testMap(hashMap);
}

public static void testMap(Map<Integer, String> map)
{
	map.put(5, "FOX");
	map.put(8, "TIGER");
	map.put(9, "LION");
	map.put(3, "EAGLE");
	map.put(4, "MONKEY");
	map.put(6, "DOG");
	map.put(7, "SWAN");
	
	
	for(Integer key:map.keySet())
	{
		String value=map.get(key);
		
		System.out.println(key+ ":" + value);
	}
}
}

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args)
	{
		
	Map<Integer,String>	hm=new HashMap<Integer,String>();
	hm.put(1,"white");
	hm.put(2, "red");
	hm.put(3, "Green");
	hm.put(4, "Blue");
	hm.put(5, "Yellow");
	System.out.println("Original map values"+ hm.entrySet());
	hm.remove(4);
	System.out.println("After removing colour from Hashmap"+ hm.entrySet());
	if(hm.containsValue("Green"))
		
	{
		System.out.println("Green value exist in Map");
	}
	
	else {
		System.out.println("Green value doesn't exist in Map");

	}
	System.out.println("size of the Map  "+hm.size());
	}

}

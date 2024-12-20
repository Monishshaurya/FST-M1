import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args)
	{

		
	Set<String>hs=new HashSet<String>();
	hs.add("Grapes");
	hs.add("Banana");
	hs.add("Orange");
	hs.add("Water melon");
	hs.add("Apple");
	hs.add("Pine Apple");
	System.out.println("size of the HashSet "+ hs.size());

	hs.remove("Orange");
	System.out.println("After removing size of the HashSet "+ hs.size());
	hs.remove("lemon");
	System.out.println("checking Apple is present "+ hs.contains("Apple"));
	
	}

}

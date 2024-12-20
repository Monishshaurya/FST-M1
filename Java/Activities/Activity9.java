import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) 
	{

		List<String>myList=new ArrayList<String>();
		myList.add("Mounika");
		myList.add("Monish");
		myList.add("Kavitha");
		myList.add("Saritha");
		myList.add("Vanitha");
		System.out.println("printing all the names in the list");

		for(String str: myList)
		{
			System.out.println(str);
		}
		
		System.out.println("retrieve the 3rd name "+ myList.get(2));

		System.out.println("Checking name exists in the ArrayList "+ myList.contains("Vanitha"));

		System.out.println("Printing the number of names"+ myList.size());
		myList.remove(2);
		System.out.println("After removing the number of names in the list"+ myList.size());
		
	}

}

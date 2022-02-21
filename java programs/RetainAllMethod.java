package java_training4;
import java.util.*;
// retain all means if there is same elements in two arraylist it will printed 
public class RetainAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strlist = new ArrayList<String>();
		strlist.add("Apples");
		strlist.add("Mangoes");
		strlist.add("Grapes");
	
		ArrayList<String> str1 = new ArrayList<String>();
		str1.add("Pappayas");
		str1.add("olives");
		str1.add("Apples");
		
		strlist.retainAll(str1);
		Iterator<String> itr = strlist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}

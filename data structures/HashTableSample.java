package javanewsample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,String> hm = new HashMap<>();	
		hm.put('N', "Neptune");
		hm.put('E', "Earth");
		hm.put('V', "Venus");
		hm.put('M', "Mars");
		
		Hashtable<Character,String> ht = new Hashtable<>(hm);
		
		System.out.println("Mapping of hashtable: : "+ht);
		ht.put('M', "Mercury");
		System.out.println("Updated Mapping: "+ht);
		
		ht.remove('V');
		System.out.println("Traversing through Hash table: ");
		
		for(Map.Entry<Character, String> i: ht.entrySet())
		{
			System.out.println("Key:"+i.getKey()+" Value: "+i.getValue());
		}
	}

}

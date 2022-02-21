package javanewsample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap1 = new HashMap<>(4, 0.5f);
		
		hmap1.put(1, "Alex");
		hmap1.put(2, "Javi");
		hmap1.put(3, "Kevin");
		hmap1.put(5, "Ron");
		System.out.println("The mappings: "+hmap1);
		
		hmap1.put(1, "Ajit");
		hmap1.remove(2);
		System.out.println("Updated Mappings: "+hmap1);
		
		HashMap<Integer,String> hmap2 = new HashMap<Integer,String>(hmap1); //copying into another hash map
		
		System.out.println("The new hmap2: "+hmap2);
		System.out.println();
		
		for(Map.Entry<Integer,String> e: hmap2.entrySet())
		{
			System.out.println("Key:"+e.getKey()+" Value: "+e.getValue());
		}	
	}

}

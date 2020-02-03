import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
HashMap <Integer, String> hmap = new HashMap<Integer, String>();
		
				
		hmap.put (12, "Bill");
		hmap.put (30, "John");
		hmap.put (7, "Cam");
		
				
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("key is " + mentry.getKey() + " and the value is " );
			System.out.println(mentry.getValue());
			
		}
		
	}

}

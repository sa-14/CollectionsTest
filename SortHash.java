import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHash {
	
	static Map<String, Integer> map = new HashMap<>(); 
	  
        public static void sortbykey() 
    { 
                TreeMap<String, Integer> sorted = new TreeMap<>(); 
  
        sorted.putAll(map); 
  
                for (Map.Entry<String, Integer> entry : sorted.entrySet())  
            System.out.println("Key = " + entry.getKey() +  
                         ", Value = " + entry.getValue());         
    } 
      
        public static void main(String args[]) 
    { 
        map.put("Joe", 80); 
        map.put("Bryant", 90); 
        map.put("Gigi", 60); 
        map.put("Dan", 75); 
        map.put("Fred", 40); 
  
                sortbykey(); 
    } 
} 
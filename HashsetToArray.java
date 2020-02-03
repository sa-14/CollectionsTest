import java.util.HashSet;

public class HashsetToArray {
	
	public static void main(String[] args) {
		
		
		HashSet<String> hset = new HashSet<String>();
	 
	     hset.add("Element1");
	     hset.add("Element2");
	     hset.add("Element3");
	    
	 
	    
	     System.out.println("HashSet: "+ hset);
	 
	     
	     String[] array = new String[hset.size()];
	     hset.toArray(array);
	 
	    
	     System.out.println("Array elements: ");
	     for(String temp : array){
	        System.out.println(temp);
	        
	        
	     }
	  }
	}



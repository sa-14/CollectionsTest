
import java.util.*; 

public class ArrayListDesc {
	
	 
	    public static void main(String args[]) 
	    { 
	  
	         ArrayList<String> list = new ArrayList<String>(); 
	  
	        list.add("A"); 
	        list.add("B"); 
	        list.add("C"); 
	        list.add("D"); 
	        list.add("E"); 
	  
	      System.out.println("Unsorted ArrayList: " + list); 
	  
	         
	        Collections.sort(list, Collections.reverseOrder()); 
	  
	        System.out.println("Sorted ArrayList " + "in Descending order : " + list); 
	     
	} 

}

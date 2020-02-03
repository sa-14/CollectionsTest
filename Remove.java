import java.util.ArrayList;
import java.util.List;

public class Remove {
	
	 public static void main(String[] args) 
	    { 
	       
	        List<String>  myAlist = new ArrayList<String>(); 
	        myAlist.add("A"); 
	        myAlist.add("B"); 
	        myAlist.add("C");
	        myAlist.add("D"); 
	        myAlist.add("E");
	        System.out.println("Original ArrayList : " + myAlist); 
	        myAlist.remove(0); 
	        myAlist.remove(3);
	        System.out.println("New ArrayList : " + myAlist); 
	  
	       
	    } 
	} 



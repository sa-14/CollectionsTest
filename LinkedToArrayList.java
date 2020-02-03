import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedToArrayList {
	
	public static void main(String[] args) {
		
		
		
	    LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Harry");
	    linkedlist.add("Jack");
	    linkedlist.add("Tim");
	   

	    List<String> list = new ArrayList<String>(linkedlist);

	    for (String str : list){
	      System.out.println(str);
	      
	      
	    }
	 }
	}

	

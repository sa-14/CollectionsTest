import java.io.*; 
import java.util.*; 

public class ReverseArrayList { 
  
    
	public static void main(String[] args) 
    { 
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>(); 
  
        
        arrlist.add(new Integer(9)); 
        arrlist.add(new Integer(145)); 
        arrlist.add(new Integer(878)); 
       ; 
        System.out.println("Elements before reversing: "); 
        printElements(arrlist); 
  
       
        Collections.reverse(arrlist); 
        System.out.println("\nElements after reversing: "); 
        printElements(arrlist); 
    } 
  
  
    public static void printElements(ArrayList<Integer> alist) 
    { 
        for (int i = 0; i < alist.size(); i++) { 
            System.out.print(alist.get(i) + " "); 
            
            
        } 
    } 
} 
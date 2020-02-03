import java.io.*; 
import java.util.*; 
	
	
public class Compare implements Comparable<Compare>{
	
	
	  
	    private double rating; 
	    private String name; 
	    private int year; 
	  
	    
	    public int compareTo(Compare m) 
	    { 
	        return this.year - m.year; 
	    } 
	  
	   
	    public Compare(String nm, double rt, int yr) 
	    { 
	        this.name = nm; 
	        this.rating = rt; 
	        this.year = yr; 
	    } 
	  
	    
	    public double getRating() { return rating; } 
	    public String getName()   {  return name; } 
	    public int getYear()      {  return year;  } 
	} 
	  
	 
	class Main 
	{ 
	    public static void main(String[] args) 
	    { 
	        ArrayList<Compare> list = new ArrayList<Compare>(); 
	        list.add(new Compare("Force Awakens", 8.3, 2015)); 
	        list.add(new Compare("Star Wars", 8.7, 1977)); 
	        list.add(new Compare("Empire Strikes Back", 8.8, 1980)); 
	        list.add(new Compare("Return of the Jedi", 8.4, 1983)); 
	  
	        Collections.sort(list); 
	  
	        System.out.println("Movies after sorting : "); 
	        for (Compare movie: list) 
	        { 
	            System.out.println(movie.getName() + " " + 
	                               movie.getRating() + " " + 
	                               movie.getYear()); 
	        } 
	    } 
	} 



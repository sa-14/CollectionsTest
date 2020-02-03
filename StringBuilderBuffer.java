
public class StringBuilderBuffer {
	
	
	    // Concatenates to String 
	    public static void num1 (String s1) 
	    { 
	        s1 = s1 + "Abc"; 
	    } 
	  
	    // Concatenates to StringBuilder 
	    public static void concat2(StringBuilder s2) 
	    { 
	        s2.append("Def"); 
	    } 
	  
	    // Concatenates to StringBuffer 
	    public static void concat3(StringBuffer s3) 
	    { 
	        s3.append("Ghi"); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        String s1 = "ZYX"; 
	        num1(s1);  
	        System.out.println("String: " + s1); 
	  
	        StringBuilder s2 = new StringBuilder("QRS"); 
	        concat2(s2); 
	        System.out.println("StringBuilder: " + s2); 
	  
	        StringBuffer s3 = new StringBuffer("LMN"); 
	        concat3(s3); // s3 is changed 
	        System.out.println("StringBuffer: " + s3); 
	    } 
	}





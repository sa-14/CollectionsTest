import java.util.ArrayList;


public class RemoveFromArray {

	public static void main(String[] args) {
		
		ArrayList <Integer> arrlist = new ArrayList<Integer> (5);
		
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(4);
		
		System.out.println(arrlist);
		
		arrlist.remove(2);
		
		System.out.println(arrlist);
		
		
	}

}

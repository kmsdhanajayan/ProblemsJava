package Question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySwap {

	public static void main(String[] args) {
		 
	        //Create a list with items  
	        List<Integer> list = Arrays.asList(44, 55, 99, 77, 88, 66);  //output:[44, 55, 66, 77, 88, 99]
	          System.out.println("List before swapping: "+list);  
	          Collections.swap(list, 2, 5);  
	          System.out.println("List after swapping: "+list);  
	       
}

}

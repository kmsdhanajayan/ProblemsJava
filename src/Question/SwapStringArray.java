package Question;

import java.util.Arrays;
import java.util.Collections;

public class SwapStringArray {

	public static void main(String[] args) {
		 String[] words = {"a", "c", "b", "d"};
		 
	        Collections.swap(Arrays.asList(words), 1, 2);
	        System.out.println(Arrays.toString(words));
	}

}

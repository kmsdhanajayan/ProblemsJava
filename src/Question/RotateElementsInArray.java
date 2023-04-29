package Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElementsInArray {

	public static void main(String[] args) {
		// creating ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
  
        // Printing list before rotation
        System.out.println(
            "List Before Rotation : "
            + Arrays.toString(list.toArray()));
  
        // Loop according to the number of rotations
        for (int i = 0; i < 4; i++) {
            
            // storing the last element in the list
            int temp = list.get(6);
            
            // traverse the list and move elements to right
            for (int j = 6; j > 0; j--) {
                list.set(j, list.get(j - 1));
            }
            list.set(0, temp);
        }
  
        // Printing list after rotation
        System.out.println(
            "List After Rotation :  "
            + Arrays.toString(list.toArray()));
    }


	}



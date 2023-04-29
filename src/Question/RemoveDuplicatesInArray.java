package Question;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		
		
		
		int [] ar=new int[7];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
		ar[5]=10;
		ar[6]=20;
		Set<Integer> s =  new LinkedHashSet<Integer>();
		for(int i=0;i<ar.length;i++) {
			s.add(ar[i]);
		}
		for(Integer arr:s) {
			System.out.println(arr);
			
		} 
			
		
	}

}

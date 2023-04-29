package Question;

import java.util.Scanner;

public class AddnumbersInString {

	public static void main(String[] args) {
		String str = "pr2ep4in5st1"; //output=(2+4+5+1)=12
		int res = 0;
		str = str.replaceAll("[^0-9]","");
		char[] ch = str.toCharArray();
		for(int i = 0;i<ch.length;i++){
		res = res + Character.getNumericValue(ch[i]);
		}
		System.out.println(" "+res+" "); 
	}

}

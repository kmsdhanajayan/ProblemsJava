package Question;

import java.util.Map;
import java.util.TreeMap;

public class OccurenceWordString {

	public static void main(String[] args) {
 String s="welcome to java welcome to java";
 String aar[]=s.split(" ");
 int count=0;
 Map<String,Integer>map=new TreeMap<>();
 for(int i=0;i<aar.length;i++) {
	 count=0;
	 for(int j=0;j<aar.length;j++) {
		 if(aar[i].equals(aar[j])) {
			 count++;
		 }
	 }
	 map.put(aar[i], count);
 }
System.out.println(map);
	}

}

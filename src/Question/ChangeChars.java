package Question;

public class ChangeChars {
     // take 2 text input - 
	 // -> compare these 2 texts and find the minimum number of changes required to make 
	 // these 2 strings as equal
	 // Eg. testing , test - output [2] final text => test.
	 // add a letter = 3 / delete letter = 2 / modify a letter = 1
	public static void main(String[] args) {
	 String s1 = "test";
	 String s2 ="testing";
	 int length = s1.length();
	 int length2 = s2.length();
	 int lmin1 = Math.min(s1, s2);
	 System.out.println(lmin1);

	 if(s1.equals(s2)) {
		 
		 System.out.println("smae character"+s2);
	 }else {
		
		 System.out.println("uneven character"+s2);
		 
	 }
	 
	 int count=length2-length;
	 System.out.println(count);

	}

}

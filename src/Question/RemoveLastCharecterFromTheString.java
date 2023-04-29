package Question;

public class RemoveLastCharecterFromTheString {

	public static void main(String[] args) {
		String string = "i attend interviews";  //output:i attend interview
		//creating a constructor of StringBuffer class  
		StringBuffer sb= new StringBuffer(string);  
		//invoking the method  
		sb.deleteCharAt(sb.length()-1);  
		//prints the string after deleting the character   
		System.out.println(sb); 

	}

}

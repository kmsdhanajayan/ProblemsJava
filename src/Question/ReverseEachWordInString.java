package Question;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String s="my name is dhanajayan"; // output=nayajanahd si eman ym
		String r="";
		for(int i=s.length();i>0;--i)        //execute until condition i>0 becomes false  
		{  
		r=r+(s.charAt(i-1));   
		}  
		System.out.println(r);  

	}

}

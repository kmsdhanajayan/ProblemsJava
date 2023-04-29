package Question;

public class ReverseString {

	public static void main(String[] args) {
		String s ="java";   //output: avaj
		String output=" ";
		for (int i = s.length()-1; i>=0; i--) {  
			char c =s.charAt(i);
			output=output+c;
			
		}
System.out.println(output);
	}

}
//for loop

//i=3  3>=0 ->c=s.charAt(3)=a  o/p=""+a=a ,i=3-1=2;
//i=2  2>=0 ->c=s.charAt(2)=v  o/p=a+v=av ,i=2-1=1;
//i=1  1>=0 ->c=s.charAt(1)=a  o/p=av +a=ava ,i=1-1=0;
//i=0  0>=0 ->c=s.charAt(0)=j  o/p=ava+J=aa ,i=0-1=-1;
//i=-1  -1>=0 --->condion failed
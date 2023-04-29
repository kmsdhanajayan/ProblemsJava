package Question;

public class StringPool {

	public static void main(String[] args) {
		String S1=new String("java");//heap memory
		String S2="java";//string literal pool
		String S3="java";
System.out.println(S2==S3);
System.out.println(S2==S1);

	}
	

	

}

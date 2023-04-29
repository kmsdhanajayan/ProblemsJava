package Question;

public class OperatorsArithamatics {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int var;
		var =a;
		//Arithamatic Operators
		System.out.println(a+b);//15
		System.out.println(a-b);//5
		System.out.println(a/b);//2
		System.out.println(a%b);//0
		
		
		//assignment operators
		System.out.println(+var);//10
		var += a;//(10+=10)=20
		System.out.println(+var);
		var *= a;//20*10=200
		System.out.println(+var);

		//relational operators
		System.out.println(a==b);// a equals to b false
		
		System.out.println(a!=b);// a not equals to b true
		System.out.println(a>b);//true
		System.out.println(a<b);//false
		System.out.println(a>=b);//true
		System.out.println(a<=b);//false
		
	}

}

package Question;

import java.util.Scanner;

public class division {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int n1=number.nextInt();
		System.out.println("Enter 2nd Number:");
		int n2=number.nextInt();
		int sum=n1+n2;
		double div=n1/n2;
		int multiply =n1*n2;
		int subs=n1-n2;
		System.out.println(sum);
		System.out.println(div);
		System.out.println(multiply);
		System.out.println(sum+ "\n" +  div + "\n" + multiply +"\n"+ subs);
		double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.println(result);

	}

}

package questions2023;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int num = reader.nextInt();

			String evenOdd = (num % 2 == 0) ? "even" : "odd";

			System.out.println(num + " is " + evenOdd);
		}

	}

}

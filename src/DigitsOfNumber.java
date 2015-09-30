import java.util.Scanner;

public class DigitsOfNumber {
	public static void main(String args[]) {
		scannerNumber();
		
	}

	private static void scannerNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a number");
		long number=scanner.nextLong();
		long digit=1;
		System.out.print(number);
		while (number>10) {
			number = number/10;
			digit++;
		}
		if (digit==1) {
			System.out.println(" has 1 digit.");
		} else {
			System.out.println(" has " + digit +" digits.");
		}
		
		
		
	}

}

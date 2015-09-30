import java.util.Scanner;


public class DisplayEvenNumber {
	public static void main(String args[] ) {
		scannerBasedNumber();
		
	}

	private static void scannerBasedNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a number");
		int number = scanner.nextInt();
		for (int i=1;i<=number/2; i++) {
			System.out.println(i*2);
		}
		
	}
	
	

}

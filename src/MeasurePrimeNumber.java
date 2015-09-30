import java.util.Scanner;

public class MeasurePrimeNumber {
	public static void main(String args[] ) {
		scannerMeasurePrime();
		
	}

	private static void scannerMeasurePrime() {
		Scanner scanner = new Scanner(System.in);
		boolean isPrime = true;
		System.out.println("Give me a number");
		int number = scanner.nextInt();
		for (int i=2; i<number; i++  ) {
			if (number%i==0) {
				isPrime = false;
			}
		}
		
		if (isPrime == true) {
			System.out.println(number +" is Prime");
		} else {
			System.out.println(number +" is not Prime");
				
		}
		
	}
	
}

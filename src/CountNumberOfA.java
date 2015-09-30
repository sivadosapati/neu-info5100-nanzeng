import java.util.Scanner;

public class CountNumberOfA {

	public static void main(String[] args) {
		scannerCount();
		

	}

	private static void scannerCount() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Write down your words");
		String input=scanner.nextLine();
		int number=0;
		for (int i = 0; i<input.length(); i++) {
			if (input.substring(i,i+1).equals("a")) {
				number=number+1;
			}
		}
		if (number==0) {
			System.out.println(input + " has no 'a'. ");
		} else {
			System.out.println(input + " has " + number +" 'a'.");
		}
		
		
		
	}

}

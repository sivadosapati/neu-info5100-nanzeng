import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		scannerCount();
		

	}

	private static void scannerCount() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Write down your words");
		String input=scanner.nextLine();
		System.out.println("Write down your character");
		String character=scanner.next();
		int number=0;
		for (int i = 0; i<input.length(); i++) {
			if (input.substring(i,i+1).equals(character)) {
				number=number+1;
			}
		}
		if (number==0) {
			System.out.println("'" + input +"'" + " has no character ");
		} else {
			System.out.println("'" + input + "'" + " has " + number + " " + "'" + character + "'");
		}
	}
		

}

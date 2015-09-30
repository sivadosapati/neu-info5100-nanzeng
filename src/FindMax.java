
import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		scannerFindMax();

	}

	private static void scannerFindMax() {
		Scanner scanner=new Scanner (System.in);
		System.out.println("Give me a set of numbers, enter exit for break");
		String input=scanner.next();
		if (!input.equals("exit")) {
		    int num=Integer.parseInt(input);
		    int max=num;
		    input=scanner.next();
		    while(!input.equals("exit")) {
		    	num=Integer.parseInt(input);
		    	if (num>=max) {
		    		max=num;	
		    	}
		    	input=scanner.next();
		    }
		    System.out.println("The maximum number is " + max);
		} else {
			System.out.println("Please enter numbers before entering exit.");
		}
	}
			

}

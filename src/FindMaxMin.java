
import java.util.Scanner;

public class FindMaxMin {

	public static void main(String[] args) {
		scannerFindMaxMin();

	}

	private static void scannerFindMaxMin() {
		Scanner scanner=new Scanner (System.in);
		System.out.println("Give me a set of numbers, enter exit for break");
		String input=scanner.next();
		if (!input.equals("exit")) {
		    int num=Integer.parseInt(input);
		    int max=num;
		    int min=num;
		    input=scanner.next();
		    while(!input.equals("exit")) {
		    	num=Integer.parseInt(input);
		    	if (num>=max) {
		    		max=num;	
		    	}
		    	if (num<=min) {
		    		min=num;
		    		
		    	}
		    	input=scanner.next();
		    }
		    System.out.println("The maximum number is " + max + ", the minimum number is " + min);
		} else {
			System.out.println("Please enter numbers before entering exit.");
		}
	}
			

}

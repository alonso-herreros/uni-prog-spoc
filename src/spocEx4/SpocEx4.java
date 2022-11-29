package spocEx4;
import java.util.Scanner;

public class SpocEx4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2;
		String in;
		char op;

		while (true) { // I'll use an infinite loop and break when the input is valid.
			System.out.print("Enter a positive integer: ");
			n1 = input.nextInt();
			System.out.print("Enter another positive integer: ");
			n2 = input.nextInt();
			
			if (n1>0 && n2>0) { // Valid input, we may now move on
				break;
			}
			// If we are here, the input was invalid and we will continue to loop.
			System.out.println("The input provided is not valid. Please try again.");
		}
		
		System.out.println("Select an operation: ");

		boolean askAgain;
		do {
		// These are not the best algorithms, but they work fine for small positive integers.

			System.out.println("(A) Least common multiple\n"
					+ "(B) Greatest common divisor\n"
					+ "(C) Random integer value in the range defined by the introduced numbers\n"
					+ "(D) Difference between the square roots of the numbers");
			
			do {
				in = input.nextLine(); // Discard all empty lines
			}
			while (in.length() == 0);
			op = in.toUpperCase().charAt(0);
			
			askAgain = false;
			
			switch (op) {
			case 'A': // Least common multiple.
				int lcm = 0;
				do { // Try n1*k for integer k until it is divisible by n2
					lcm += n1;
				}
				while (lcm % n2 != 0);
				System.out.printf("The least common multiple is %d.\n", lcm);
				break;
				
			case 'B': // Greatest common divisor
				int gcd = 1;
				for (int i = 1; i<=n1 && i<=n2; i++) { // Brute force solution
					if (n1%i == 0 && n2%i == 0) {
						gcd = i;
					}
				}
				System.out.printf("The greatest common divisor is %d.\n", gcd);
				break;
				
			case 'C': // Random integer (including both)
				// We generate a random number between 0 and 1, multiply that by the size
				// of our range, and then add the minimum value.
				System.out.println("Here's 100 random integers between those two: ");
				for (int i=0; i<10; i++) {
					for (int j=0; j<10; j++) {						
						int randInt = (int) (Math.random()*(n2-n1+1)) + n1;
						System.out.printf("%d, ", randInt);
					}
					System.out.println();
				}
				break;
				
			case 'D': // Difference between the square roots. Self explanatory
				double dif = Math.abs(Math.sqrt(n1) - Math.sqrt(n2));
				System.out.printf("The difference between their square roots is %.2f.\n", dif);
				break;
				
			default: // Handling wrong inputs here
				System.out.println("Could not find the selected operation.");
				System.out.println("Please select an option by typing only the letter associated:");
				askAgain = true;
				break;
			}
		}
		while (askAgain);
		
	}

}

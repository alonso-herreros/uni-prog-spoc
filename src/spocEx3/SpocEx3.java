package spocEx3;
import java.util.Scanner;

public class SpocEx3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.println("MUSEUM TICKETS PRICE:\n\n"
				+ "1) The total price of the tickets to visit the museum is:\n"
				+ "2) Base fixed price = € 10, plus;\n"
				+ "3) 5€ per visitor when the number of visitors is less than 8, or;\n"
				+ "4) 4€ per visitor when the number of visitors is between 8 and 15, or;\n"
				+ "5) 3€ per visitor when the number of visitors is greater than 15.");
		
		System.out.print("How many people are visiting? ");
		n = input.nextInt();

		if (n < 1) {
			System.out.println("That's not a valid number of visitors, it must be greater than 0.");
			return;
		}

		System.out.printf("The total price will be %d EUR.\n", 10 + n*((n<8)?5:(n<16)?4:3));	
	}
}

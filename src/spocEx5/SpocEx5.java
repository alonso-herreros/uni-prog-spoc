package spocEx5;
import java.util.Arrays;
import java.util.Scanner;

public class SpocEx5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[7];
        
        System.out.println("Introduce 7 names:");
        for (int i=0; i<7; i++) {
            names[i] = input.nextLine();
        }
        
        for (int i=0; i<names.length; i++) {
            final String name = names[i];
            final long count = Arrays.stream(names).filter(n -> n.equals(name)).count();
            System.out.printf("\nThe name %s has been introduced %d times.", name, count);
        }
    }

}

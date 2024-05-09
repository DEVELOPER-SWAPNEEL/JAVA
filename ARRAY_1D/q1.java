/*Take an array of names as input from the user and print them on the screen. */
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF STRINGS YOU WANT AS INPUT: ");
        int nik = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        String[] arr = new String[nik];
        
        // INPUT
        for (int i = 0; i < nik; i++) {
            System.out.print("ENTER NAME " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }
        
        // OUTPUT
        System.out.println("Names entered by the user:");
        for (int i = 0; i < nik; i++) {
            System.out.println("NAME NUMBER " + (i + 1) + " IS: " + arr[i]);
        }
    }
}

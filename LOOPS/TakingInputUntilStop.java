import java.util.Scanner;

public class TakingInputUntilStop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        char ch;
        do {
            System.out.println("ENTER THE NUMBER: ");
            int n = sc.nextInt();
            sum += n;
            System.out.println("DO YOU WANT TO CONTINUE? ENTER 'Y' IF YES OR 'N' IF NO");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        
        System.out.println("Sum of all numbers entered: " + sum);
    }
}

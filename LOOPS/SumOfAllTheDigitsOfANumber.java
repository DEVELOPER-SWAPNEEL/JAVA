import java.util.Scanner;
public class SumOfAllTheDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTRE THE VALUE OF N");
        int n=sc.nextInt();
        int sum =0,rem=0;
        while (n>0) {
            rem=n%10;
            sum+=rem;
            n=n/10;
        }
            System.out.println("THE SUM OF ALL THE DIGITS OF THE PROVIDED NUMEBR IS FOUND TO BE "+sum);
    }
}

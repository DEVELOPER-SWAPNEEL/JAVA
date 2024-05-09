
import java.util.Scanner;
public class sumOfNnumbers{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTRE THE VALUE OF N:   ");
        int n= sc.nextInt();
        int i=0,sum=0;
        while (i<=n) {
            sum = sum+i;
            i++;
        }
        System.out.println("THE SUM OF ALL THE NATURAL NUMBERS TILL "+n+" IS "+sum+" ");
    }
}

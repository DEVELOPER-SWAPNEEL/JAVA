import java.util.Scanner;
public class ReversingANumber {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("ENTRE THE NUMBER ");
    int n= sc.nextInt();
    int rem=0,sum=0;
    while (n!=0) {
        rem=n%10;
        sum=rem*10+sum;
        n=n/10;
    }
        System.out.println("THE REVERSED NUMBER IS "+sum);
}  
}

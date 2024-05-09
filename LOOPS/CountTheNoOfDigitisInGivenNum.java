import java.util.Scanner;
public class CountTheNoOfDigitisInGivenNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTRE THE VALUE OF N:   ");
        int n= sc.nextInt();
        int count=0;
        for(int i=0;n!=0;i++){
            n=n/10;
            count++;
            
        }
            System.out.println("THE NUMBER OF DIGITS PRESENT IN THE PROVIDED NUMBER IS "+count);
    }
}

import java.util.Scanner;
public class ReminderWithoutUsingModulusOperator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\nENTRE THE VALUE OF FIRST NUMBER:  ");
        int first =sc.nextInt();
        System.out.println("\n"+"ENTRE THE VALUE OF SECOEND NUMBER:  ");
        int secoend=sc.nextInt();
        int quo= first/secoend;
        int rem=first-(quo*secoend);
        System.out.println("THE REMAINDER OF THE PROVIDED DIVISION IS "+rem);
    }
}
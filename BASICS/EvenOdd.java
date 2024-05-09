import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTRE THE NUMBER:   ");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println("THE PROVIDED NUMBER "+num+" IS EVEN");
        }
        else{
            System.out.println("THE PROVIDEDE NUMBER IS ODD");
        }
    }
}

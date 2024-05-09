/*Enter 3 numbers from the user & make a function to print their average. */
import java.util.Scanner;
public class Question_1 {
    public static int Avg(int a,int b,int c){
        return (a+b+c)/2;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTRE THE THREE NUMBERS :   ");
        int first =sc.nextInt();
        int secoend= sc.nextInt();
        int third = sc.nextInt();
        System.out.println("THE AVERAGE OF THE PROVIDED NUMBERS  IS :   "+Avg(first, third, secoend));
    }
}

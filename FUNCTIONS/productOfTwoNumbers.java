import java.util.Scanner;
public class productOfTwoNumbers {
    public static int calculate(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTRE TWO NUMBERS :  ");
        int first = sc.nextInt();
        int secoend=sc.nextInt();
        System.out.println("THE MULTIPLICATION OF TWO NUMBERS IS FOUND TO BE :  "+calculate(first, secoend));
    }
}

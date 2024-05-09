import java.util.Scanner; 
    public class AddTwoNumbers {
        public static int AddTwoNUmber(int a,int b){
            int sum = a+b;
            return sum;
        }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("ENTRE THE NUMBERS:  ");
            int first= sc.nextInt();
            int secoend= sc.nextInt();
            System.out.println("THE SUM OF THE TWO NUMBERS ARE: "+AddTwoNUmber(first, secoend));
        }
    }

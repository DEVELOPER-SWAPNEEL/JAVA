import java.util.Scanner;
public class rectangular {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTRE THE VALUE OF ROWS AND COLOUMNS:   ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(" *");
            }
        System.out.println("");
        }
    }
   
}
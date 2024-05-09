import java.util.Scanner;

public class holoRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTRE THE NUMBER OF ROWS AND COLOUMNS : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        for(int i=1;i<a;i++){
            for(int j=1;j<b;j++){
                if(i==1||i==a-1||j==1||j==b-1) System.out.print("*");
                else System.out.println(" ");
            }
        }
    }
}

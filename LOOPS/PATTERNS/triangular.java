import java.util.Scanner;
public class triangular {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTRE THE NUMBER OF ROWS YOU WANT THE PATTERN:  ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){  //FOR INVERTED TRIANGLE CASE WE JUST NEED TO CHANGE THE CONDITION TO j<=(n+1-i)
                System.out.print("*");
            }
                System.out.println();
        }
    }
}

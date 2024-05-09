/*Qs. Take a matrix as input from the user. Search for a
given number x and print the indices at which it occurs.*/
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTRE THE NUMBER OF ROWS AND COLOUMNS :   ");
        int row= sc.nextInt();
        int col= sc.nextInt();
        int arr[][]= new int[row][col];
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("ENTRE THE VALUE OF THE ELEMENT "+(i+1)+" x "+(j+1)+" :");
                arr[i][j]=sc.nextInt();
            }
        } 
        System.out.println("THE ENTRED MATRIX IS AS FOLLOWED:   ");
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("ENTRE THE SEARCHING VALUE :");
        int src= sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(src==arr[i][j]) System.out.println("THE INDICES OF THE SEARCHED NUMBER IN THE MATRIX IS : "+(i+1)+" x "+(j+1));
            }
        }
    }
}

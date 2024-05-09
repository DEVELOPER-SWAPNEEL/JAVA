/*Take an array as input from the user. Search for a given number x and print the index at which it occurs. */
import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTRE THE NUMBERS OF ELEMENTS PRESENT IN THE ARRAY: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        //INPUT
        for(int i=0;i<n;i++){
            System.out.print("ENTRE NUMBER "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("ENTRE THE NUMBER YOU WANT TO SEARCH :   ");
        int SEARCH= sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==SEARCH) System.out.println("THE INDEX OF THE PROVIDED NUMBER IN THE ARRAY IS : "+i);
        }
    }
}

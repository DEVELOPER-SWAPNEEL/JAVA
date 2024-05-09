import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTRE THE NUMBER OF ELEMENTS YOU WANT IN THE ARRAY");
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("ENTRE ELEMENT NO. "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        //ARRANGEMENT INTO ASSENDING ORDER; WE NEED TO SWAP NUMBERS.

    }
}

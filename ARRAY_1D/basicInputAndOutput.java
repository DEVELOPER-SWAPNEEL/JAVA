import java.util.Scanner;
public class basicInputAndOutput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTRE THE NUMBER OF INPUTS: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        //INPUT
        for(int i=0;i<n;i++){
            System.out.print("PLEASE ENTRE NUMBER "+(i+1)+"  : ");
            arr[i]=sc.nextInt();
        }
        //OUTPUT
        for(int i=0;i<n;i++){
            System.out.println("ENTRED NUMBER "+(i+1)+" IS : "+arr[i]);
        }
    }
    
}

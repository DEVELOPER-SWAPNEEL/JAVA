//Find the maximum & minimum number in an array of integers. 

import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTRE THE NUMBER OF ELEMENTS PRESENT IN THE ARRAY:  ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("ENTRE ELEMET NO. "+(i+1)+"  :");
            arr[i]=sc.nextInt();
        }
        int max=0;
        //MAXIMUM 
        for(int i =0;i<arr.length;i++){
            if(max<arr[i]) max=arr[i];
        }
        System.out.println("MAXIMUM OF THE ARRAY IS : "+max);
        int min=max;
        //MINIMUM
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]) min=arr[i];
        }
        System.out.println("MINIMUM OF THE ARRAY IS  :"+min);
    }
}

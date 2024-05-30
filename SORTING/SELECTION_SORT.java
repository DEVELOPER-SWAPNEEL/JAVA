import java.util.Scanner;
public class SELECTION_SORT {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTRE THE NUMBER OF ELEMENTS YOU WANT IN THE ARRAY: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("ENTRE THE VALUE OF "+(i+1)+" ELEMENT: ");
            arr[i]=sc.nextInt();
        }
        //SELECTION SORT
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n-1-i;j++){
                if(arr[smallest]>arr[j]) smallest=j;
            }
        int temp = arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
        
        }
        //----->>PRINTING THE SORTED ARRAY
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

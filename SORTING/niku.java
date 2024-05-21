
import java.util.Scanner;

public class niku {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS PRESENT IN THE ARRAY YOU WANT TO SORT: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("ENTER THE " + (i + 1) + "TH ELEMENT IN THE ARRAY: ");
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("SORTED ARRAY IN ASCENDING ORDER: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

        // Close the scanner
        sc.close();
    }
}

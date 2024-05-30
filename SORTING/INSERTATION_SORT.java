import java.util.Scanner;

public class INSERTATION_SORT {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("ENTER THE NO. OF ELEMENTS YOU WANT IN THE ARRAY: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
    
            // Input array
            for (int i = 0; i < n; i++) {
                System.out.print("ENTER THE VALUE OF " + (i + 1) + " ELEMENT OF THE ARRAY: ");
                arr[i] = sc.nextInt();
            }
    
            // Insertion Sort
            for (int i = 1; i < n; i++) {
                int current = arr[i];
                int j = i - 1;
                while (j >= 0 && current < arr[j]) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = current;
            }
    
            // Print sorted array
            System.out.println("SORTED ARRAY IN ASCENDING ORDER: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    
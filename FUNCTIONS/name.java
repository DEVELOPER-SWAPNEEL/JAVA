import java.util.Scanner;
public class name {
        public static void yourName(String st){
            System.out.println("USING FUNCTIONS YOUR PROVIDED NAME IS:  "+st);
            return;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTRE YOUR NAME:    ");
        String str= sc.nextLine();
        yourName(str);//CALLING THE FUNCTION
    }
}

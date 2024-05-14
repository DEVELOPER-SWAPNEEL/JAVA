import java.util.Scanner;
public class CompairingTwoStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTRE YOUR NAME 1 :");
        String name1= sc.nextLine();
        System.out.print("ENTRE YOUR NAME 2 :");
        String name2= sc.nextLine();
        //this is wrong way of compairation
        /*  if(name1 == name2) {
             System.out.println("They are the same string");
         } else {
             System.out.println("They are different strings");
        }*/
        //CORRECT WAY OF COMPAIRATION IS   :
        if(name1.compareTo(name2)==0){      //IMPORTANT:    IF STRING1==STRING2 RETURN 0
                                            //IMPORTANT:    IF STRING1 > STRING2 RETURN +VE ANY NO. AND 'A'<'B' AS PER STRING EVALUATION
                                            //IMPORTANT:    IF STRING1 < STRING2 RETURN -VE ANY NO.  HENCE 'HELLO' > 'AELLO'
            System.out.println("BOTH THE STRINGS ARE EQUAL  ");
        }
        else System.out.println("STRINGS ARE DIFFERENT");
 
    }
}

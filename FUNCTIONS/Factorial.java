/* THERE IS NO FACTORIAL FOR NEGATIVE NUMBERS */

import java.util.Scanner;
public class Factorial {
    public static int fact(int a){
        if(a<0) {
            System.out.println("THE PROVIDED NUMBER IS -VE HENCE NO VALID FACTORIAL IS POSSTIBLE "); }
        
        int multi=1;
        for(int i=a;i>0;i--){
            multi=multi*i;
        }
    return multi;
    }    
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("ENTRE THE VALUE OF N:  ");
            int n= sc.nextInt();
            System.out.println("THE FACTORIAL OF THE PROVIDED NUMBER IS :   "+fact(n));
        }
}

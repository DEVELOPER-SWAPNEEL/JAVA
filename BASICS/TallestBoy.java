// Find the tallest student among 3 students
import java.util.Scanner;
public class TallestBoy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("\nENTRE THE HEIGHT OF FIRST PERSON:  ");
        double first =sc.nextDouble();
        System.out.println("ENTRE THE HEIGHT OF SECOEND PERSON  ");
        double secoend=sc.nextDouble();
        System.out.println("ENTRE THE HEIGHT OF THIRD PERSON");
        double third= sc.nextDouble();
        
        if(first>secoend){
            if(secoend>third){
                System.out.println("THE FIRST PERSON HAVING HEIGHT AS "+first+" METER IS THE TALLEST AMONG ALL THREE");
            }
            else if(third>first){
                System.out.println("THE THIRD PERSON HAVING HEIGHT AS "+third+" METER IS THE TALLEST AMONG ALL THREE");
            }
            else{
                System.out.println("THE SECOEND PERSON HAVING HEIGHT AS "+secoend+" METER IS THE TALLEST AMONG ALL THREE");
            }
        }
    }
    
}

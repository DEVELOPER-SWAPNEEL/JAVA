import java.util.Scanner;
public class ageGroup {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTRE THE AGE:  ");
        int age = sc.nextInt();
        
        if(age<12){
            System.out.println("THE PROVIDED AGE "+age+" IS TERMED AS CHILD");
        }
        else if(age>12&&age<18)        {
            System.out.println("THE PROVIDED AGE "+age+" IS TERMED AS TEENAGE");
        }
        else if(age>18){
            System.out.println("THE PROVIDED AGE "+age+" IS TERMED AS ADULT");
        }
        else{
            System.out.println("THE INPUT AGE IS INVALID");
        }
    }
}

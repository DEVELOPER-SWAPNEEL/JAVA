import java.util.Scanner;
public class Concartination {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTRE YOUR FIRST NAME : ");
        String name1 = sc.nextLine();
        System.out.println("ENTRE YOUR LAST NAME : ");
        String name2=sc.nextLine();
        String FullName= name1+" "+name2;
        System.out.println("YOUR FULL NAME IS : "+FullName);

        //TO KNOW THE LENGTH OF THE STRING WE ARE PROVIDED WITH LENGHT FUNCTION
        System.out.println("THE LENGTH OF THE PROVIDED FULL NAME IS:   "+FullName.length());
    }
}

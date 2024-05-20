import java.util.Scanner;
public class basics_string_builder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb= new StringBuilder("Niku");
        System.out.println(sb);
        System.out.println(sb.charAt(0));       //HERE charAt(index) gives the particular character at the index provided
        sb.setCharAt(0, 'S');
        System.out.println("THE MODIFIED STRING IS : "+sb); //TO CHANGE OR MUITATE A CHARACTER IN A STRING USING STRINGBUILDER  WE USE 'SetcharAt(0,'S');'
        sb.insert(0, 'O');//ADDING A COMPLETELY NEW CHARATER USING sb.insert(0,'O');
        System.out.println(sb);
        sb.delete(0, 1);
        System.out.println("AFTER DELECTION OF A PARTICULER CHARACTER: "+sb);
        StringBuilder gb= new StringBuilder("H");
        gb.append("e");
        gb.append("l");
        gb.append("l");
        gb.append("o");
        System.out.println(gb);
        System.out.println(gb.length());
    }
}

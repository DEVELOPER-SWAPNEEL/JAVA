import java.util.Scanner;
public class reverseAStringUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTRE YOUR STRING TO BE REVERSED: ");
        String sbb= sc.nextLine();
        StringBuilder sb= new StringBuilder(sbb);
        for(int i=0; i<sb.length()/2; i++) {        //---------> OR WE CAN SIMPLY USE sb.reverse() TO REVERSE THE STRING..
        int front = i;
        int back = sb.length() -1-i; 
        
        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);
        sb.setCharAt(front, backChar);
        sb.setCharAt(back, frontChar);
    }
    System.out.println(sb);
}
}
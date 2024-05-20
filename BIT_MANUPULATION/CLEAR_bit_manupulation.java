/*HERE WE HAVE TO CLEAR THE WHOLE OR MAKE IT COMPLETELY ZERO TO MAKE IT HAPPEN WE USE 
 * FIRST THE NUMBER'S NOT
 */
public class CLEAR_bit_manupulation {
    public static void main(String[] args) {
        int n=9;//1001
        int not= ~(n);
        int new_bit= (not & n);
        String int_bit= Integer.toBinaryString(new_bit);
        System.out.println(new_bit);
    }
}

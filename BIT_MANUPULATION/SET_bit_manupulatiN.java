/*HERE WE HAVE USED SET BIT WHICH USES BITMASK METHOD TO MAKE A POSITIONAL PLACE FOR 1 IN THE BIT SYSTEM 
 * THEN WE HAVE USED BIT OR OPERATOR TO SET THE NEW 1 IN THE ORIGINAL INT NUMBER BIT
 * TO PRINT THE IN BINARY WE HAVE USED String Bit_int=Integer.toBinaryString(new_bit);
 */
public class SET_bit_manupulatiN {
    public static void main(String[] args) {
    int n=9;//1001
    int pos=2;
    int bit_mask=1<<pos;
    int new_bit= bit_mask | n;
    String Bit_int=Integer.toBinaryString(new_bit);
    System.out.println(Bit_int);
    }
}

//HERE GET BIT OPERATION IS PERFORMED..
/*WHERE WE FIRST LEFT SHIFT 1<<POSITION TO THE POSITION THE GET BIT IS ASKED.. THE MEANING OF THE QUESTION IS TO FIND THE BIT AT THE PROVIDED POSTION..
 * HENCE TO ACHIEVE IT WE FIRST USE LEFT SHIFT OPERATION THEN WE USE BIT AND IN IF STATEMENT IF IT GIVES ZERO THEN ZERO ELSE ONE.. 
 */
public class GET_bit_manupulation {
    public static void main(String[] args) {
        int n=5;//0101
        int pos=2;
        int bit_mask= 1<<pos ;
        if((bit_mask & n) ==0){
            System.out.println("THE BIT AT THE POSITION IS ZERO");
        }
        else{
            System.out.println("THE BIT AT THE POSITION IS ONE..");
        }
    }
}

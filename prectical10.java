/* print following design
    *****
   *****
  *****
 *****
*****
 */
import java.util.*;
public class prectical10 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=0; j<5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

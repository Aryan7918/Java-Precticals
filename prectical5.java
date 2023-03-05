/* print follwing design
         *
       * *
     * * *
   * * * *
 * * * * *
 */
import java.util.*;
public class prectical5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n=sc.nextInt();
        for(int i=5; i>0; i--){
            for(int j=0; j<i-1;j++){
                System.out.print("  ");
            }
            for(int j=0; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

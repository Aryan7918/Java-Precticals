/* print following design
 * * * * *
 * * * *
 * * *
 * *
 *
 */
import java.util.*;
public class prectical4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and width: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=5; i>0; i--){
            for(int j=0; j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/* print following design
 * * * * *
 *       *
 *       *
 *       *
 * * * * *
 */
import java.util.*;
public class prectical2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and width: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

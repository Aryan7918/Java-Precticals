/* print following design
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */
import java.util.*;
public class prectical9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n=sc.nextInt();
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

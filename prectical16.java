import java.util.Scanner;

//Print if a number n is prime or not
public class prectical16 {
    public static void main(String[] args) {
        Scanner scc=new Scanner(System.in);
        int n=scc.nextInt();
        int i;
        boolean isprime=true;
        if(n==1 || n==0){
            System.out.println(n+ " is not prime number");
        }
        for(i=2;i<(n/2);i++ ){
            if(n%i==0){
                isprime = false;
                break;
            }
        }
        if(isprime){
            System.out.println(n+ " is a prime number");
        }else {
            System.out.println(n+ " is not a prime number");
        }
    }
}

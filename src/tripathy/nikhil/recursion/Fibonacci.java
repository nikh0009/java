//Program for fibonacci series using recursion.
package tripathy.nikhil.recursion;
import java.util.Scanner;
public class Fibonacci {
static int a=-1,b=1,s=0;
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    for(int i=0;i<n;i++) {
	System.out.print(RecTerm.fib(i)+" ");
    }
    //fibonacci(n);
    in.close();
}
}

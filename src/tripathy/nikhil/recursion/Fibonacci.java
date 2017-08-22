//Program for fibonacci series using recursion.
package tripathy.nikhil.recursion;
import java.util.Scanner;
public class Fibonacci {
static int a=-1,b=1,s=0;
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    fibonacci(n);
    in.close();
}
public static void fibonacci(int n) {
    if(n>0) {
	s=a+b;
	a=b;
	b=s;
	System.out.print(s+" ");
	fibonacci(n-1);
    }
}
}

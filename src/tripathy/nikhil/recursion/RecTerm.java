//Returns the nth element of recursion series.
package tripathy.nikhil.recursion;
import java.util.Scanner;
public class RecTerm {
static int a=-1,b=1,s=0;
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
     int term=fib(n);
     System.out.println(term);
    in.close();
}
 public static int fib(int n) {
  if(n<2)
      return n;
  else
  return fib(n-1)+fib(n-2);
}
}
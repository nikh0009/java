//Finding the GCD of two numnbers using euclidean method
package tripathy.nikhil.recursion;
import java.util.Scanner;
public class GCD {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int g = gcd(a,b);
    in.close();
    System.out.println(g);
}
public static int gcd(int a,int b) {
    if(a==0)
	return b;
    else return gcd(b%a,a);
   
}
}

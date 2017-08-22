package tripathy.nikhil.recursion;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int fact= factorial(n);
    System.out.println(fact);
    in.close();
}
public static int factorial(int n) {
    if(n>0)
	return n*factorial(n-1);
    else
	return 1;
}
}

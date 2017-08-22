//Recursive program for tower of hanoi.
package tripathy.nikhil.recursion;
import java.util.Scanner;
public class Tower {
public static void main(String[] args)throws Exception {
    System.out.println("Enter the number of disks");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println("Source is tower A destination is tower B");
    towerOfHanoi(n,'A','B','C');
    System.out.println("Moved all the plates to tower B");
    in.close();
}
public static void towerOfHanoi(int n,char source,char dest,char aux) throws InterruptedException {
    if(n==1) {
	Thread.sleep(5000);
	System.out.println("Moved disk 1 from "+source+" to "+dest);
	return;
    }
    towerOfHanoi(n-1, source, aux, dest);
    Thread.sleep(5000);
    System.out.println("Moved disk "+n+" from "+source+" to "+dest);
    towerOfHanoi(n-1, aux, dest, source);
}
}

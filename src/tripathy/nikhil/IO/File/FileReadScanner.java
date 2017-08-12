//File reading using Scanner class
package tripathy.nikhil.IO.File;
import java.util.*;
import java.io.*;
public class FileReadScanner {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the path:");
    File file = new File(in.nextLine());
    in.close();
    try {
	in = new Scanner(file);
	long st = System.currentTimeMillis();
	while(in.hasNextLine()) {
	    System.out.println(in.nextLine());
	}
	System.out.println("Time taken"); 
	System.out.println(System.currentTimeMillis()-st);
    }catch(FileNotFoundException e) {
	System.out.println("Wrong path specified");
	e.printStackTrace();
    }finally {
	in.close();
    }
    
}
}

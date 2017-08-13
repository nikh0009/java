//Java program two merge two file by alternative lines.
package tripathy.nikhil.IO.File;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileMerging {
public static void main(String[] args) {
    try {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the path of first file:");
	File first = new File(in.nextLine());
	System.out.println("Enter the path of second file:");
	File second = new File(in.nextLine());
	BufferedReader br1 = new BufferedReader(new FileReader(first));
	BufferedReader br2 = new BufferedReader(new FileReader(second));
	System.out.println("Enter the path of destination file:");
	File dest = new File(in.nextLine());
	FileWriter fw = new FileWriter(dest);
	String s1=br1.readLine(),s2=br2.readLine();
	while ((s1) !=null || (s2)!=null) {
	    if(s1 != null) {
		fw.write(s1);
		fw.write("\n");
		 s1=br1.readLine();
	    }
	    if(s2 != null) {
		fw.write(s2);
		fw.write("\n");
		 s2= br2.readLine();
	    }
	   
	   
	}
	fw.flush();
	br1.close();
	br2.close();
	fw.close();
	in.close();
    }catch(FileNotFoundException e) {
	System.out.println("File not found");
    }catch(IOException e) {
	System.out.println("IO exception occured!");
    }
    System.out.println("Operation complete!");
}
}

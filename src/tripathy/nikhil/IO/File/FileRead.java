//Reading a file using using FileReader
package tripathy.nikhil.IO.File;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileRead {
public static void main(String[] args)throws IOException {
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the file path:");
    File file = new File(in.nextLine());
    FileReader fr = new FileReader(file);
    long st = System.currentTimeMillis();
    int r = fr.read();
    while(r != -1) {
	System.out.print((char) r);
	r = fr.read();
    }
    System.out.println("\nTime taken");
    System.out.println(System.currentTimeMillis()-st);
    fr.close();
    in.close();
}
}

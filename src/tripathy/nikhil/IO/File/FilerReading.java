//Reading a file using BufferedReader
package tripathy.nikhil.IO.File;
import java.util.*;
import java.io.*;
public class FilerReading {
public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the path of the file to read!");
    File file = new File(in.nextLine());
    in.close();
    String s;
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    //Reading the file using buffered reader
    long st = System.currentTimeMillis();
    while((s=br.readLine())!= null) {
	System.out.println(s);
    }
    System.out.println("Time taken");
    System.out.println(System.currentTimeMillis()-st);
    br.close();
}
}

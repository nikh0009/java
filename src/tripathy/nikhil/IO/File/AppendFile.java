//Java program to open a file in append mode.
package tripathy.nikhil.IO.File;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class AppendFile {
public static void main(String[] args)throws Exception {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the file path:");
    File ip = new File(in.nextLine());
    FileWriter fw = new FileWriter(ip,true);
    System.out.println("Enter the text to append:");
    fw.write(in.nextLine());
    in.close();
    fw.close();
}
}

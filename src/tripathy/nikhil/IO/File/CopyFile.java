//Copy a file using FileInputStream and FileOutputStream
package tripathy.nikhil.IO.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class CopyFile {
public static void main(String[] args) {
 long st=0;
    try {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the source file path:");
     FileInputStream source = new FileInputStream (in.nextLine());
     System.out.println("Enter the destination path:");
     FileOutputStream destination = new FileOutputStream(in.nextLine());
     int b;
     st=System.currentTimeMillis();
     while ((b = source.read()) != -1) {
	 destination.write(b);
     }
     source.close();
     destination.close();in.close();
 }catch(FileNotFoundException e) {
     System.out.println("wrong path!File not found");
 }catch(IOException e) {
     e.printStackTrace();
 }
    System.out.println(System.currentTimeMillis()-st);
 System.out.println("Succesfully copied!");
}
}

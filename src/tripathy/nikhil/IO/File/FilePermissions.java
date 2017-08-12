//File permission program.Fails if user does'nt have permission to change the file permission.
package tripathy.nikhil.IO.File;
import java.io.File;
import java.util.Scanner;
public class FilePermissions {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the file path:");
    File file = new File(in.nextLine());
    System.out.println("Checking for permissions");
    System.out.println("is wirteable "+ file.canWrite());
    System.out.println("is readable "+ file.canRead());
    System.out.println("is readable "+ file.canExecute());
    System.out.println("Setting permission");
    file.setExecutable(!file.canExecute());
    file.setReadable(!file.canRead());
    file.setWritable(false);
    System.out.println("New permission");
    System.out.println("is wirteable "+ file.canWrite());
    System.out.println("is readable "+ file.canRead());
    System.out.println("is readable "+ file.canExecute());
}
}

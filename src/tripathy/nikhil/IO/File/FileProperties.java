/*Java program to list all the files and their properties in the given path.
 * 
 * */
package tripathy.nikhil.IO.File;
import java.io.File;
import java.util.Scanner;
public class FileProperties {
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the directory path:");
    File main_dir= new File(in.nextLine());
   File[] files = main_dir.listFiles();
   System.out.println("file properties!");
   for(File f:files) {
       String name=f.getName();
       System.out.println("Name: "+name);
       System.out.println("Parent:"+f.getParent());
       System.out.println("Absolute path: "+ f.getAbsolutePath());
       System.out.println(name+" is directory "+ f.isDirectory());
       System.out.println(name+" is wirteable "+ f.canWrite());
       System.out.println(name+" is readable "+ f.canRead());
       System.out.println(name+" is hidden "+ f.isHidden());
   }
   in.close();
}
}

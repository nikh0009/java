//Java program to delete an existing file.
package tripathy.nikhil.IO.File;
import java.io.File;
import java.util.Scanner;
public class RemoveFile {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the path of directory or file to be delete");
    String path = in.nextLine();
    try {
	 File f1 = new File(path);
	 if(f1.delete()) {
		   System.out.println("Deleted!");
	       }
	       else {
		   if(f1.isDirectory()) {
		       File[] f=f1.listFiles();
		       for(File ff:f)
			   System.out.println(ff.getName());
		       System.out.println("Its a directory. Make sure its empty. Can't delete.");
		   }
		       
		   else
		       System.out.println("Incorrct path or file does'nt exists try again!");
	       }
		   
    }catch(Exception e) {
	e.printStackTrace();
    }
    finally{
	in.close();
    }
}
}

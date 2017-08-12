//Java program to delete an existing file.
package tripathy.nikhil.IO.File;
import java.io.File;
public class RemoveFile {
public static void main(String[] args) {
    try {
	 File f1 = new File("C:\\Users\\ntripath\\Desktop\\nikhiltr\\firstFile.txt");
	 if(f1.delete()) {
		   System.out.println("file deleted");
	       }
	       else
		   System.out.println("Not deleted");
    }catch(Exception e) {
	e.printStackTrace();
    }
}
}

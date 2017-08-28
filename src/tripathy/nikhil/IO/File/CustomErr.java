//Setting System.err to custom file 
package tripathy.nikhil.IO.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
public class CustomErr {
public static void main(String[] args) {
    try {
    OutputStream f = new FileOutputStream("C:\\Users\\ntripath\\Desktop\\IOJava\\err.txt");
    PrintStream fo = new PrintStream(f);
    System.setErr(fo);
    System.err.println("Hello error");
    }catch(FileNotFoundException f) {
	System.out.println("File not found!");
    }
}
}

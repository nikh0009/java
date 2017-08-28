//program to provide Scanner custom InputStream
package tripathy.nikhil.IO.File;
import java.util.*;
import java.io.*;
public class CustomInput {
public static void main(String[] args) {
    try {
	FileInputStream in = new FileInputStream("C:\\Users\\ntripath\\Desktop\\IOJava\\input.txt");
	Scanner s = new Scanner(in);
	System.out.println(s.nextInt());
	System.out.println(s.nextInt());
	s.close();
    }catch(FileNotFoundException e) {
	System.out.println(e);
    }
    
}
}

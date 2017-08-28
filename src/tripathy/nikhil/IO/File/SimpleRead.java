//Simple program to see read() function of InputStream.
package tripathy.nikhil.IO.File;
import java.io.*;
public class SimpleRead {
public static void main(String[] args)throws Exception {
    FileInputStream file = new FileInputStream("C:\\Users\\ntripath\\Desktop\\IOJava\\Sample.txt");
    int data = file.read();
    while(data != -1) {
	System.out.println(data);
	data=file.read();
    }
    file.close();
   //Sample code to write to output stream.
    OutputStream os = new FileOutputStream("C:\\Users\\ntripath\\Desktop\\IOJava\\output.txt");
    os.write("Hello nikhil".getBytes());
    os.close();
}
}

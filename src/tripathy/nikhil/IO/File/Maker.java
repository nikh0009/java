//Java program to make a file and directory
package tripathy.nikhil.IO.File;
import java.io.File;
import java.io.IOException;
public class Maker {
public static void main(String[] args) {
   try {
       File f =new File("C:\\Users\\ntripath\\Desktop\\nikhiltr");
       f.mkdir();
       File file = new File(f,"firstFile.txt");
       file.createNewFile();
       System.out.println(file.getFreeSpace());
   }catch(IOException e){
       e.printStackTrace();
   }
}
}

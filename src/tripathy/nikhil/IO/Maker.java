package tripathy.nikhil.IO;
import java.io.*;
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

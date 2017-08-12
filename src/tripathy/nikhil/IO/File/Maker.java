//Java program to make a file and directory
package tripathy.nikhil.IO.File;
import java.io.File;
import java.io.IOException;
import java.util.Scanner; 
public class Maker {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the path to create directory");
    String path = in.nextLine();
    String filename="";
   try {
       File f =new File(path);
       //Creates a directory in the given file path.Returns boolean value.
       if(f.mkdir()) {
	   System.out.println("Directory created!");
       }else
	   System.out.println("Directory Exists!");
       System.out.println("Enter the file name to be created!");
       filename = in.nextLine();
       File file = new File(f,filename);
       //Creates the file in the specified directory.Returns boolean value.
       if(file.createNewFile())
       System.out.println("File created!");
       else
	   System.out.println("File exists!");
       System.out.println("canExecute() "+file.canExecute());
   }catch(IOException e){
       e.printStackTrace();
   }finally {
       in.close();
   }
}
}

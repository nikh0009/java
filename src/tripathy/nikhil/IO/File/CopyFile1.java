//Copy file using FileWriter and BufferedReader.Better Performance than FileInputStream and FileOutputStream. 
package tripathy.nikhil.IO.File;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class CopyFile1 {
public static void main(String[] args) {
   long st=0;
    try {
    Scanner in=  new Scanner(System.in);
    File source = new File(in.nextLine());
    BufferedReader br = new BufferedReader(new FileReader(source));
    File destination = new File(in.nextLine());
    FileWriter fw = new FileWriter(destination);
    String str="";
    st=System.currentTimeMillis();
    while((str=br.readLine())!= null) {
	fw.write(str);
    }
    in.close();
    br.close();
    fw.close();
    System.out.println(System.currentTimeMillis()-st);
}catch(FileNotFoundException e) {
    System.out.println("File not found!");
}catch(IOException e) {
    System.out.println("IO exception!");
}
}
}
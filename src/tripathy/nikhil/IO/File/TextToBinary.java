package tripathy.nikhil.IO.File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class TextToBinary {
public static void main(String[] args) {
    
    try{
	Scanner in = new Scanner (System.in);
	System.out.println("Enter the source:");
	File file = new File(in.nextLine());
	FileInputStream fi = new FileInputStream(file);
	System.out.println("Enter the destination:");
	FileOutputStream fo = new FileOutputStream(new File(in.nextLine()));
	byte[] temp= new byte[fi.available()];
	while(fi.read(temp)!=-1) {
		fo.write(temp);
	    }
	in.close();
	fi.close();
	fo.close();
    }
    catch(FileNotFoundException e) {
	System.out.println("File not found:"+e);
    }catch(IOException e) {
	System.out.println("IOException :"+e);
    }
    
}
}

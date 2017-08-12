package tripathy.nikhil.IO.File;
import java.io.File;
import java.util.Scanner;
public class RenameFile {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the current filepath");
    String curr = in.nextLine();
    File current = new File(curr);
    System.out.println("Enter the new name path");
    File newname = new File(in.nextLine());
    if(current.renameTo(newname))
	System.out.println("Succesfully Renamed!");
    else
	System.out.println("Could'nt rename!");
    in.close();
    System.out.println(current.toString());
    
}
}

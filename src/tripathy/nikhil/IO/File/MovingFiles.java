package tripathy.nikhil.IO.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class MovingFiles {
public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the origin of file");
    Path origin = Paths.get(in.nextLine());
    System.out.println("Enter new location");
    Path newloc = Paths.get(in.nextLine());
    Path res = Files.move(origin,newloc);
    if(res == null)
	System.out.println("File moving failed");
    else
	System.out.println("Files moved!");
}
}

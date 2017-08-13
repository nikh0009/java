package tripathy.nikhil.IO.File;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class SumUsingFiles {
public static void main(String[] args)throws Exception {
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the input file path");
    File file = new File (in.nextLine());
    System.out.println("Enter the output file path");
    File output = new File(in.nextLine());
    BufferedReader br = new BufferedReader(new FileReader(file));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    Integer s= a+b;
    FileWriter fw = new FileWriter(output);
    fw.write("The sum is :\n");
    fw.write(s.toString());
    fw.close();
    br.close();
    in.close();
}
}

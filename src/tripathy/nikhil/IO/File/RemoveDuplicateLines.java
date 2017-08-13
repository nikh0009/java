package tripathy.nikhil.IO.File;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
public class RemoveDuplicateLines {
    public static void main(String[] args) {
	try {
	    Scanner in = new Scanner(System.in);
		System.out.println("Enter the file path:");
		File ip = new File(in.nextLine());
		System.out.println("Enter the output file path:");
		File op = new File(in.nextLine());
		HashSet<String> hs = new HashSet<String>();
		BufferedReader br = new BufferedReader(new FileReader(ip));
		FileWriter fw = new FileWriter(op);
		String str=br.readLine();
		while(str !=null) {
		    if(hs.add(str))
			fw.write(str);
		    str=br.readLine();
		}
		br.close();
		fw.close();
		in.close();
	}catch(IOException s) {
	    System.out.println("Io exceptions");
	}
    }
}

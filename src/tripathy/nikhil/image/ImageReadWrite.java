//Simple java program to read and write an image!
package tripathy.nikhil.image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
public class ImageReadWrite {
public static void main(String[] args) {
    int height=640;
    int width=963;
    //Stores the image in RAM.
    BufferedImage bi = null;
    System.out.println("Enter the path of the image:");
    Scanner in = new Scanner(System.in);
    File file = new File(in.nextLine());
    System.out.println("Enter the destination:");
    File out = new File(in.nextLine());
    try {
	
	    //TYPE_INT_ARGB means that we are representing the alpha,red,green and blue components of the image.
	    bi = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
	    //Reading image
	    bi = ImageIO.read(file);
	    System.out.println("Reading complete!");
    }catch(IOException e) {
	System.out.println("could'nt read!");
    }
    try {
	ImageIO.write(bi, "jpg", out);
	System.out.println("copy complete");
    }catch(IOException e) {
	System.out.println("Coudnt write");
    }
    
}
}

package tripathy.nikhil.collections;
//Class to order the string in descending order of their length.
import java.util.Comparator;

public class StringLengthDesc implements Comparator<String> {
    public int compare(String s1,String s2) {
	return s2.length()-s1.length();
    }

}

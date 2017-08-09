package tripathy.nikhil.collections;
//Class implements comparator arranges the collection in ascending order of length.
import java.util.Comparator;
public class StringLengthAsc implements Comparator<String> {
public int compare(String s1,String s2) {
    return s1.length()-s2.length();
}
}

/*An EnumSet is a Set which contains enum instance of a specific enum type, in a more efficient way than other Set implementations 
 * */
package tripathy.nikhil.collections;
import java.util.*;
import tripathy.nikhil.JVM.*;
public class Enumsets {
public static void main(String[] args) {
    EnumSet<Colors> set1,set2,set3;
    //adds these enum instances to set.
    set1 = EnumSet.of(Colors.Blue,Colors.Red);
    //adds the complement of enum and the specified set.
    set2 = EnumSet.complementOf(set1);
    //adds all the instance of the enums to the specified set.
    set3 = EnumSet.allOf(Colors.class);
    System.out.println(set1);
    System.out.println(set2);
    System.out.println(set3);
}
}

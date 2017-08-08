/*Implementation of set interface
 * having different implementations.
 * */
package tripathy.nikhil.collections;
import java.util.*;
public class Sets {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str= in.nextLine();
    in.close();
    //Different implementation of set interface
    HashSet<Character> hs = new HashSet<Character>();
    TreeSet<Character> ts = new TreeSet<Character>();
    LinkedHashSet<Character> lhs= new LinkedHashSet<Character>();
    for(int i=0;i<str.length();i++) {
	if(str.charAt(i)!=' ') {
	    	hs.add(str.charAt(i));
		ts.add(str.charAt(i));
		lhs.add(str.charAt(i));
	}
    }
    Iterator<Character> hit= hs.iterator();
    Iterator<Character> tit = ts.iterator();
    Iterator<Character> lit = lhs.iterator();
    //Displaying contents of hashset.Does'nt stores elements in any order stores according to best retrieval techniques.
    System.out.println("Contents of HashSet");
    while(hit.hasNext()) {
	System.out.print(hit.next()+" ");
    }
    //Displaying content of TreeSet.Contains element in ascending order.
    System.out.println("Contents of TreeSet");
    while(tit.hasNext())
	System.out.print(tit.next()+" ");
    //Displaying contents of LinkedHashSet.Retains insertion order.
    System.out.println("Contents of LinkedHashSet");
    while(lit.hasNext())
	System.out.print(lit.next()+" ");
}
}

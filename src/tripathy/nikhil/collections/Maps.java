/*Various implementation of map interface
 * */
package tripathy.nikhil.collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Maps {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str= in.nextLine();
    //HashMap does'nt maintain any order stores data according to best storage and retrieval technique.
    HashMap<Character,Integer> hm =new HashMap<Character,Integer>();
    //TreeMap stores the data in sorted order.
    TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
    //LinkedHashMap stores the data according to insertion order.
    LinkedHashMap <Character,Integer> lhm = new LinkedHashMap<Character,Integer>();
    //HashTable 
    Hashtable<Character,Integer> ht= new Hashtable<Character,Integer>();
    Integer freq=null;
    for(int i=0;i<str.length();i++) {
	freq=hm.get(str.charAt(i));
	hm.put(str.charAt(i), freq==null?1:freq+1);
    }
    for(int i=0;i<str.length();i++) {
	freq=ht.get(str.charAt(i));
	ht.put(str.charAt(i), freq==null?1:freq+1);
    }
    for(int i=0;i<str.length();i++) {
	freq=tm.get(str.charAt(i));
	tm.put(str.charAt(i), freq==null?1:freq+1);
    }
    for(int i=0;i<str.length();i++) {
	freq=lhm.get(str.charAt(i));
	lhm.put(str.charAt(i), freq==null?1:freq+1);
    }
    System.out.println("HashMap:");
    displayForEach(hm);
    System.out.println("TreeMap:");
    displayForEach(tm);
    System.out.println("LinkedHashMap:");
    displayForEach(lhm);
    System.out.println("Hashtable:");
    displayForEach(ht);
    System.out.println("Using iterator");
    displayMapIterator(hm.entrySet().iterator());
}
/*Method to display content of Map using for each.
 * Map.Entry is a class with key and value wrapped into one.   
*/
public static void displayForEach(Map<Character,Integer> m) {
try {
    for(Map.Entry<Character, Integer> entry:m.entrySet())
	System.out.println("Key:"+entry.getKey()+",Values:"+entry.getValue());
}catch(NullPointerException e) {
    System.out.println("Null Map");
}
}
/*Method to display contents of Map
 * Using Iterators.
 * */
public static void displayMapIterator(Iterator<Map.Entry<Character, Integer>> it) {
    while(it.hasNext()) {
	Map.Entry<Character, Integer> entry = it.next();
	System.out.println("Key:"+entry.getKey()+",Value:"+entry.getValue());
    }
}
}

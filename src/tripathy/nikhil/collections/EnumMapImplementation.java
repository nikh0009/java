/*EnumMap implementation in java
 * */
package tripathy.nikhil.collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

import tripathy.nikhil.JVM.Colors;
public class EnumMapImplementation {
public static void main(String[] args) {
    EnumMap<Colors, String> em = new EnumMap<Colors,String>(Colors.class);
    for(Colors col:Colors.values()) {
	em.put(col, "Color is "+col);
    }
    Iterator<Map.Entry<Colors, String>> it = em.entrySet().iterator();
    while(it.hasNext()) {
	Map.Entry<Colors, String> entry = it.next();
	System.out.println(entry.getKey()+":"+entry.getValue());
    }
}
}

/*Java program for priority queue implementation 
 * Priority Queue does'nt allows null
 * */
package tripathy.nikhil.collections;
import java.util.*;
public class PriorityQueueImplementation {
public static void main(String[] args) {
    PriorityQueue<String> pq = new PriorityQueue<String>(new StringLengthDesc());
    pq.add("a");
    pq.add("aa");
    pq.add("aaa");
    pq.add("aaaa");
   // System.out.println(pq);
    Iterator <String> it = pq.iterator();
    while(it.hasNext()) {
	System.out.println(it.next());
    }
    //Using peek function.Returns the first element without removing it. 
    System.out.println("Peeked "+pq.peek());
    Iterator<String> it2 = pq.iterator();
    while(it2.hasNext()) {
	System.out.println(it2.next());
    }
    //Using poll function.Return the first elements also removes it.
    System.out.println("Polled "+pq.poll());
    System.out.println("After poll");
    Iterator<String> it3=pq.iterator();
    while (it3.hasNext()) {
	System.out.println(it3.next());
    }
}
}

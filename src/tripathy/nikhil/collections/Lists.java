/*implementation of list interface in java
 * different implementation in java list
 * */
package tripathy.nikhil.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;
public class Lists {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str= in.nextLine();
    //List supported by array in background
    ArrayList<Character> al = new ArrayList<Character>();
    //LinkedList representation of list interface
    LinkedList<Character> ll = new LinkedList<Character>();
    for(int i=0;i<str.length();i++) {
	al.add(str.charAt(i));
	ll.add(str.charAt(i));
    }
    char[] arr=ArrayUtils.toPrimitive(al.toArray(new Character[0]));
    for(char ch:arr)
	System.out.print(ch+" ");
    Iterator<Character> it = al.iterator();
    Iterator<Character> lit= ll.iterator();
    System.out.println("Elements in arraylist");
    while(it.hasNext()) {
	System.out.print(it.next()+" ");
    }
    System.out.println("\nElements in linked list");
    while(lit.hasNext()) {
	System.out.print(lit.next()+" ");
    }//System.out.println(it.hasNext());
    in.close();
    //List in reverse order
    System.out.println("\nReverse of array list");
   for(int i=al.size()-1;i>=0;i--)
       System.out.print(al.get(i)+" ");
   //Reversing the list using iterator
   ListIterator<Character> i = ll.listIterator();
   while(i.hasNext()) {
       i.next();
   }
   System.out.println("\nReverse of linkedlist");
   while(i.hasPrevious()) {
       System.out.print(i.previous()+" ");
   }
   //Sorting both the list using sort function. Sorted in ascending order.
   Collections.sort(al);
   Collections.sort(ll);
   System.out.println("\nSorted Arraylist");
   for(char j:al) {
       System.out.print(j+" ");
   }
   System.out.println("\nSorted Linkedlist");
   for(char j:ll)
       System.out.print(j+" ");
   Collections.sort(al,new DescSor());
   System.out.println("\n Arraylist sorted in descending order.");
   for(char c:al) {
       System.out.print(c+" ");
   }
   System.out.println("\n linkedlist sorted in descending order.");
   Collections.sort(ll,new DescSor());
   for(char c:ll)
       System.out.print(c+" ");
}
}
class DescSor implements Comparator<Character> {
    public int compare(Character c,Character c1) {
	return c1-c;
    }
}
package tripathy.nikhil.JVM;

import java.util.Properties;

public class StaticBlockParent {
static int i=9;
static String str="Nikhil Tripathy";
static {
    System.out.println("Inside Static block parent!");
    System.out.println(i);
    System.out.println(str);
    System.out.println(Properties.class.getClassLoader());
    System.out.println(StaticBlockParent.class.getClassLoader());
    System.out.println("Leaving static block parent");
}
StaticBlockParent(){
    System.out.println("Inside parent class");
}
public static void temp() {
    System.out.println("Inside temp!");
    
}
}

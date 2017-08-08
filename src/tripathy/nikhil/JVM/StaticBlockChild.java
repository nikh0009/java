package tripathy.nikhil.JVM;

public class StaticBlockChild extends StaticBlockParent {
static int i=0;
static String str="Tripathy";
static {
    System.out.println("Inside static block child");
    System.out.println(i+" "+str);
    System.out.println("Leaving static block child");
}
StaticBlockChild(){
    System.out.println("In child constructor");
}
    public static void main(String...strings) {
    new StaticBlockChild(); 
}
}

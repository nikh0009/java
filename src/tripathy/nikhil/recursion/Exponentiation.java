package tripathy.nikhil.recursion;

public class Exponentiation {
public static void main(String[] args) {
    int n=3,m=4;
    int ans=expo(n,m);
    System.out.println(ans);
}
public static int expo(int n,int m) {
    if(m==0)
	return 1;
    else
	return n*expo(n,m-1);
}
}

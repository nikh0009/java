package tripathy.nikhil.recursion;
//Maxim sub array problem using recursion.
import java.util.Scanner;
public class MaxSubArray {
static int sum=Integer.MIN_VALUE;
static int left_sum=Integer.MIN_VALUE;
static int right_sum=Integer.MIN_VALUE;
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
	arr[i]=in.nextInt();
    int max=maxSubArray(arr,0,n-1);
    System.out.println(max);
    in.close();
}
public static int maxSubArray(int[] arr,int l,int h) {
    if(l==h)
	return arr[l];
    else {
	int mid = (l+h)/2;
	return max(maxSubArray(arr,l,mid),maxSubArray(arr, mid+1, h),crossingSubArray(arr,l,mid,h));
    }
}
public static int crossingSubArray(int[] arr,int l,int m,int h) {
    sum=0;
    for(int i=m;i>=l;i--) {
	sum+=arr[i];
	if(sum>left_sum)
	    left_sum=sum;
    }
    sum=0;
    for(int j=m+1;j<=h;j++) {
	sum+=arr[j];
	if(sum>right_sum){
	    right_sum=sum;
	}
    }
    return left_sum+right_sum;
}
public static int max(int a,int b) {
    return ((a>b) ? a: b);
}
public static int max(int a,int b,int c) {
    return (max(max(a,b),c));
}
}

package tokk03;
import java.util.*;
public class ArraysClassObj {
	static Random rand=new Random();
	static int pRand(int mod) {
		return Math.abs(rand.nextInt())%mod+1;
	}
	public static void main(String[] args) {
		Integer[] a=new Integer[pRand(20)];
		System.out.println("length of a is "+a.length);
		for(int i=0;i<=a.length;i++) {
			a[i]=pRand(500);
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}

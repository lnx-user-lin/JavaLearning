package net.toollib;

public class IsEven {
	public static boolean isEven(int x) {
		if(x%2==0) {return true;}
		else {return false;}
	}
	public static void main(String[] args) {
		System.out.println(isEven(4));
		System.out.println(isEven(5));
	}

}

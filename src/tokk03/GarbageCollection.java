package tokk03;
import java.util.*;
class Book{
	boolean checkedOut=false;
	Book(boolean checkOut){
		checkedOut=checkOut;
	}
	void checkIn() {
		checkedOut=false;
	}
	protected void finalize() {
		if (checkedOut) {
			System.out.println("Error:check out");
		}
	}
}

public class GarbageCollection {
	public static void main(String[] args) {
		Book novel=new Book(true);
		novel.checkIn();
		Book hhh=new Book(true);
		hhh.checkIn();
		//new Book(true);
		System.gc();
		int i=8;
		int j=5;
		Random rank=new Random();
		int kkk=rank.nextInt();
	}

}

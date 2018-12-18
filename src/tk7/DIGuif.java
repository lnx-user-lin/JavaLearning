package tk7;
import static net.toollib.Print.*;

public class DIGuif {
	public static int f(int x) {
		if(0==x) {
			return 1;
		}
			return x+f(x-1);
		
	}
	public static void main(String[] args) {
		Integer ix;
		ix=f(8);
		print(ix.toString());
	}

}

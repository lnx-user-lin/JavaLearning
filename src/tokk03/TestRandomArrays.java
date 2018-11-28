package tokk03;
import java.util.*;
/**
 * 空间数组的理解：第一个下标代表不同的二维数组，第二三个下标代表各自的平面二维数组
 * 随机数产生数组缺点，易产生无意义数组
 * @author dell
 *
 */
public class TestRandomArrays {
	static Random rand=new Random();
	static int pRand(int mod) {
		return Math.abs(rand.nextInt())%mod+1;
	}
	public static void main(String[] args) {
		int[][][] a3=new int[pRand(5)][][];
		//System.out.println("X rax"+a3.length);
		for(int i=0;i<a3.length;i++) {
			a3[i]=new int[pRand(5)][];
			//System.out.println("return"+i+"rax"+a3[i].length);
			for(int j=0;j<a3[i].length;j++) {
				a3[i][j]=new int[pRand(5)];
				//System.out.println("return"+j+"rax"+a3[i][j].length);
			}
		}
		for(int i=0;i<a3.length;i++) {
			for(int j=0;j<a3[i].length;j++) {
				for(int k=0;k<a3[i][j].length;k++) {
					a3[i][j][k]=i+j+k;
					System.out.println(
							"a3["+i+"]["+j+"]["+k+"]="
							+a3[i][j][k]);
				}
			}
		}
	}
}

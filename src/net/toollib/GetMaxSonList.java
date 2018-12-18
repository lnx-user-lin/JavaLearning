package net.toollib;
/**
 * <h1 style="color:red;font-family:sans-serif;">
 * 获得最大子数列的最优算法
 * </h1>
 * <p><em>思想:连续N项和，只要其大于0,就有可能和下一位元素组成更大的子数列</em></p>
 * @author ppll
 *
 */
public class GetMaxSonList {
	private int listhead;
	private int listend;
	public int getListHead() {
		return listhead;
	}
	public int getListEnd() {
		return listend;
	}
	public GetMaxSonList(){
		listhead=0;
		listend=0;
	}
	public int getMaxList(int[] A) {
		int thisSum=new Integer(0);
		int maxSum=new Integer(0);
		for(int i=0;i<A.length;i++) {
			thisSum+=A[i];
			if(thisSum>maxSum) {
				maxSum=thisSum;
				listend=i;//一旦出现更大的连续和，那么这一位的数记录位置
			}else if(thisSum<0) {
				thisSum=0;//整个字数列的和小于0,即使下一位是正数，也不会和之前的数列有任何瓜葛
				listhead=i+1;//当thissum小于0时，记录它的下一位，因为这一位是个负数，盼望下一位是正数
			}
		}
		return maxSum;
	}
	public int getMaxList(Integer[] A) {
		return this.getMaxList(A);
	}
	public static void main(String[] args) {
		int[] b={3,-6,6,7,2,-8,-3,4,7,-2,-7,9,6,-5};
		GetMaxSonList get=new GetMaxSonList();
		int max=get.getMaxList(b);
		for(int i=get.getListHead();i<=get.getListEnd();i++) {
			System.out.print(" "+b[i]);
		}
		}
}


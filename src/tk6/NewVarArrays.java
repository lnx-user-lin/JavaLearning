package tk6;
/**
 * 
 * 新版本的对象列表形式参数
 * 使用Object...args
 * 后续调用方法时利用如下方式：
 * printArrays(new A(),new A(),new A());@author dell
 *@see tk6.VarArgs
 *@see tk6.NewVarArraysWithoutArgument
 */
public class NewVarArrays {
	private String nva;
	public NewVarArrays() {
		nva="this is an object";
	}
	/*
	 * tostring 在需要返回string时 调用，查看LABEL行
	 * */
	public String toString() {
		return nva;
	}
	static void printArrays(Object...args) {
		for(Object obj:args) {
			System.out.println(obj+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		printArrays(new Object[] {
				new Integer(34),
				new Float(3.14),
				new Double(11.11)
		});
		printArrays(34,3.14F,11.11D);
		printArrays("one","two","three");
		printArrays(new A(),new A(),new A());
		printArrays(1,2,3,4);
		printArrays(new NewVarArrays());//LABEL
	}

}

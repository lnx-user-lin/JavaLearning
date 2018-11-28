package tk6;

class A{
	
}
/**AAAA  可变参数列表的具体用法&&即使输入参数为空，任然可以运行
 * old 旧版的 /n
 * obj  对象列表形式参数/n
 * use 使用new Object[] args作为形式参数/n
 *   method 使用方法时：必须使用new Object[]｛ Object A,Object ｝
 * for（Object obj：args）相当于FOREACH遍历所有对象
 * @author dell
 *
 */
public class VarArgs {
	/**
	 * 后续调用时使用旧版的调用方式如：		
	 * printArray(new Object[] {
				new Integer(25),
				new Float(3.14),
				new Double(2.55),});
	 * @param args 一个对象型列表
	 */
	public static void printArray(Object[] args) {
	for(Object obj:args) {
		System.out.println(obj+"");
	}	
	System.out.println();
	}
	public static void main(String[] args) {
		printArray(new Object[] {
				new Integer(25),
				new Float(3.14),
				new Double(2.55),});
		printArray(new Object[] {
				"one","two","three",
		});
		printArray(new Object[] {
				new A(),new A(),new A(),
		});
		
	}

}

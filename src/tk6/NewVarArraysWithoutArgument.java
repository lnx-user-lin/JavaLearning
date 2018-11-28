package tk6;
/**
 *uu 对象列表型形式参数可使用空列表
 * @author dell
 *
 */
public class NewVarArraysWithoutArgument {
	public static void f(int required,String...str) {
		System.out.println("required: "+required+" ");
		for(String s:str) {
			System.out.println(s+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		f(1,"one");
		f(2,"two","three");
		f(0);
	}

}

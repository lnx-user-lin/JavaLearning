package tk6;
/**
 * A可变参数列表还可以是基本类型
 * @author dell
 *
 */
public class VarArrageBaseType {
	static void f(Character...args) {
		System.out.print(args.getClass());
		System.out.println(" length "+args.length);
	}
	static void g(int...args) {
		System.out.print(args.getClass());
		System.out.println(" length "+args.length);
	}
	public static void main(String[] args) {
		f('a');
		f();
		g(1);
		g();
		System.out.println("int[]: "+new int[0].getClass());
	}

}

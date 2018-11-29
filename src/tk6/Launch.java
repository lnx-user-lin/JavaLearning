package tk6;
import net.toollib.*;
class Soup1{
	private Soup1() {}
	public static Soup1 makeSoup1() {
		return new Soup1();
	}
}
class Soup2{
	private Soup2() {}
	private static Soup2 ps1=new Soup2();
	public static Soup2 makeSoup2() {
		return ps1;
	}
	public void f() {}
}
/**
 * 学习包访问权限的类中的private成员
 * public static成员的使用规则
 * 不同类的接口使用要使用类名引导
 * @author plasma
 *
 */
public class Launch {
	void testPrivate() {
		//Soup1 soup=new Soup1();
	}
	void testStatic() {
		Soup1 soup=Soup1.makeSoup1();//方法makesoup1是另外一个类的，引用必须带上类名
	}
	void testSingleton() {
		Soup2.makeSoup2().f();
	}
	public static void main(String[] args) {
		Print.println();
	}
}

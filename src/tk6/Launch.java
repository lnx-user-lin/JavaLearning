package tk6;
import net.toollib.*;
class Soup1{
	private static int sum=0;
	private Soup1() {}
	public static Soup1 makeSoup1() {
		if(8>=sum) {
			sum=sum+1;//use private sum to record Object Soup1's total,and limite Soup1 obj less than 9 
			return new Soup1();
		}
		return null;//use null to return empaty object 
	}
}
class Soup2{
	private static int sum;
	private Soup2() {}
	private static Soup2 ps1=new Soup2();
	public static Soup2 makeSoup2() {
		return ps1;
	}
	public void f() {}
}
/**
 *show private,public,friendly,protected object(method)'s differ
 * <p>
 *point at public static method's usage. must use Object's name and "." to refer
 * <p>
 *different class's public obj must use class'name+"."to refer 
 * <p>
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

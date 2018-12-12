package tk7;

import net.toollib.*;
class Father{
	private String s="clean";
	public void appen(String x) {
		s+=x;
	}
	public void delui() {appen("delui()");}
	public void acid() {appen("acid()");}
	public void cdde() {appen("cdde()");}
	public void surv() {appen("surv()");}
	public String toString() {
		return s;
	}
	/*所有的类中都可以有main（）
	 * main（）方便调试时测试每个class
	 * main（）不需要删除
	 * 调用方法是“类名。main（参数）”
	 * */
	public static void main(String...args) {
		Father x=new Father();
		x.delui();
		x.acid();
		x.cdde();
		x.surv();
		System.out.println(x);
	}
}
/**
 * <p>继承类的用法</p>
 * <p>使用extends关键字</p>
 * <p>父类的方法和成员完全拥有</p>
 * <p>可以加入新的方法</p>
 * @author plasma
 *
 */
public class BExtends extends Father {
	/*重新定义父类的方法是可行的*/
	public void svrc() {
		appen("BExtends.svrc(S)");
		/*super的用法是调用父类的方法,叫超类*/
		super.acid();
	}
	/**
	 * <p>子类的新方法</p>
	 */
	public void formet() {appen("formet()");}
	public static void main(String...args) {
		BExtends d=new BExtends();
		d.delui();
		d.acid();d.cdde();d.formet();d.svrc();
		System.out.println(d);
		Print.println("test base class");
		Father.main(args);
		
		
		
		BExtends x=new BExtends();
		x.delui();
		x.acid();x.cdde();x.formet();
		System.out.println(d);
		Print.println("test base class");
		Father.main(args);
	}
}

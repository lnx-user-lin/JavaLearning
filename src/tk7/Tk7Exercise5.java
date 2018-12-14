package tk7;
import net.toollib.*;
class A{A(int i){Print.println("A creat");}}
class B{B(int i){Print.println("B creat");}}
class D{D(int i){Print.println("D creat");}}
class C extends A{
	public C(int i) {
		super(i);
		Print.println("C construct");
	}
	B b1=new B(1);
	static D d1=new D(1);
	D d2=new D(1);
}
/**
 * <h style="color:red">子对象的创建顺序</h>
 * <hr>
 * <ul>
 * <li>C类从A类继承</li>
 * <li>C类对象建立必然先建立基类A</li>
 * <li>A类对象建立完毕后才建立B类对象</li>
 * </ul>
 *<p> <em style="font-size:30px">注意</em>:当新建一个对象时程序执行顺序仍是</p>

 *<li>static修饰的所有成员和方法</li>
 *<li>普通的成员</li>
 *<li>构造函数</li>
 *<li></li>
 *</ul>
 * <p>
 * </p>
 * @author ppll
 *
 */
public class Tk7Exercise5 {
	public static void main(String[] args) {
		C c1;
		c1=new C(1);
	}

}

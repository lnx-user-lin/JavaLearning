package tk7;
import net.toollib.*;
class A{A(){Print.println("A creat");}}
class B{B(){Print.println("B creat");}}
class C extends A{
	B b1=new B();
}
/**
 * <h style="color:red">子对象的创建顺序</h>
 * <hr>
 * <ul>
 * <li>C类从A类继承</li>
 * <li>C类对象建立必然先建立基类A</li>
 * <li>A类对象建立完毕后才建立B类对象</li>
 * </ul>
 * <p>
 * </p>
 * @author ppll
 *
 */
public class Tk7Exercise5 {
	public static void main(String[] args) {
		C c1=new C();
	}

}

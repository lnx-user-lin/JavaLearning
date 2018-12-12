package tk7;
import net.toollib.Print;
class Art{
	Art(){Print.println("Art construgter");}
}
class Drawing extends Art{
	Drawing(){
		Print.println("Drawing construgter");
	}
}
/**
 * <h1>多级继承类的构造器隐含产生一个父类的子对象</h1>
 * <br>
 * <p>当一个多级继承的子类初始化一个对象时，</p>
 * <p>其构造器先构造其父类的隐藏对象
 * <p>多级继承时一步一步先构造最基础的基类
 * @author plasma
 *
 */
public class CInilizeFormClass extends Drawing{
	public CInilizeFormClass() {
		Print.println("CInilizeFormClass constructer");
	}
	public static void main(String[] args) {
		CInilizeFormClass x=new CInilizeFormClass();
	}
}

package tk7;
import static net.toollib.Print.*;
class Homer{
	char doh(char c) {
		println("doh (char)");
		return 'd';
	}
	float doh(float c) {
		println("doh (float)");
		return 1.0f;
	}
}
class Nondd{}
class Mous extends Homer{
	/*
	@Override void doh(Nondd n) {
		println("doh (Nondd)");
	}
	*/
}
class nous extends Homer{
	void doh(Nondd n) {
		println("doh (Nondd)");
	}
	@Override char doh(char c) {
		return 'k';
	}
}
/**
 * <h1 style="color:blue"title="子类复写或重构父类方法时不会屏蔽父类的方法">名称不会屏蔽</h1>
 * <p>注意</p>
 * <ol>
 * <li><em style="color:red">@Override</em>不是关键字但可以像关键字一样用</li>
 * <li><em style="color:red">@Override</em>放在打算复写的<strong>子类</strong>方法前面</li>
 * <li><em style="color:red">@Override</em>用来防止错误地将复写写成重构的错误</li>
 * </ol>
 * @author ppll
 *
 */
public class OverLoadInExtends {
	public static void main(String[] args) {
		Mous b=new Mous();
		//b.doh(new Nondd());
		b.doh('g');
		b.doh(3f);
	}
}

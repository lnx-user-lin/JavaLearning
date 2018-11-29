package tk6;

class Sundae{
	private Sundae() {}
	static Sundae makeASundae() {
		return new Sundae();
	}
}
/**
 * 对于一个类的private私有元素的使用
 * @author plasma
 *
 */
public class IceCream {
	public static void main(String[] args) {
		Sundae x=Sundae.makeASundae();
		//Sundae y=new Sundae();
		/*构造器是私有的，无法直接调用构造器
		 * 因此必须使用一个静态的函数来构造*/
	}

}

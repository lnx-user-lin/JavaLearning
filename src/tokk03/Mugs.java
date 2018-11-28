package tokk03;
class Mug{
	Mug(int marker){
		System.out.println("Mug("+marker+")");
	}
	void f(int marker) {
		System.out.println("f("+marker+")");
	}
}
class Test{
	Test(){
		System.out.println("Test()");
	}
}

/**
 * 程序执行顺序为：
 * 主类的static变量声明
 * 主类的main函数执行
 * @author plasma
 *
 */
public class Mugs {
	static Test t1=new Test();
	Mug c1;
	Mug c2;
	{
		c1=new Mug(1);
		c2= new Mug(2);
		System.out.println("c1 & c2 initialized");
	}
	Mugs(){
		System.out.println("Mugs()");
	}
	public static void main(String[] args) {
		System.out.println("inside main()");
		Mugs x=new Mugs();
	}
	static Test t2=new Test();
}

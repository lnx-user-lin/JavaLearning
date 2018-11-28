package tokk03;
	/**hello
	 * 通过这个类可以了解当一个javaclass运行时，其流程是怎么样的
	 * 首先执行主类的main函数{首先初始化内部的static变量}
	 * 每次提及到其他的类时{程序立刻找到类的位置并且立刻初始化所有static变量，然后是一般变量，最后运行构造函数}
	 * @author plasma
	 *
	 */
class Bowl{
	/**
	 * 
	 * @param marker marker 作为标记区分声明的
	 */
	Bowl(int marker){
		System.out.println("Bowl("+marker+")");
	}
	void f(int marker) {
		System.out.println("f("+marker+")");
		
	}
}
class Table{
	/*
	 * 
	 * 通过运行的结果可以看出
	 * 当类创建的时候，首先进行static修饰的方法和变量初始化
	 * 再运行构造函数
	 */
	static Bowl b1=new Bowl(1);
	Table(){
		System.out.println("Table()");
		b2.f(1);
	}
	void f2(int marker) {
		System.out.println("f2("+marker+")");
	}
	static Bowl b2=new Bowl(2);
}
class Cupboard{
	/*
	 * 
	 * 通过运行的结果可以看出
	 * 当类创建的时候，首先进行static修饰的方法和变量初始化
	 * 再初始化非static 的变量
	 * 再运行构造函数
	 */
	Bowl b3=new Bowl(3);/* 非static的变量*/
	static Bowl b4=new Bowl(4);
	Cupboard(){
		System.out.println("Cupboard()");

	}
	void f3(int marker) {
		System.out.println("f3("+marker+")");
	}
	static Bowl b5=new Bowl(5);
}
public class StaticInitialization {
	/**
	 * 通过这个类可以了解当一个javaclass运行时，其流程是怎么样的
	 * 首先执行主类的main函数{首先初始化内部的static变量}
	 * 每次提及到其他的类时{程序立刻找到类的位置并且立刻初始化所有static变量，然后是一般变量，最后运行构造函数}
	 * @param args 什么都不是
	 */
	public static void main(String[] args) {
		System.out.println("Creat new cupboard in main");
		new Cupboard();/*非static 的cupboard内部变量在每次产生新对象时都要被重新初始化，
		但是每次的初始化的变量都是属于新对象的*/
		System.out.println("creat  new Cupboard in main");
		new Cupboard();
		t2.f2(1);
		t3.f3(1);
	}
	static Table t2=new Table();
	static Cupboard t3=new Cupboard();
}
package tokk03;
/**
 * this 关键字调用其他构造函数的用法：this代替方法名，形式上一致；
 * @author dell
 *
 */
public class Pratice {
	Pratice(){
		System.out.println("An object creat");
	}
	Pratice(String s){
		this();
		System.out.println(s);
	}
	public static void main(String[] args) {
		Pratice p1=new Pratice();
		Pratice p2=new Pratice("hello world");
		Pratice[] p3=new Pratice[3];
		for(int i=0;i<p3.length;i++) {
			p3[i]=new Pratice("kkk");
		}
	}
}

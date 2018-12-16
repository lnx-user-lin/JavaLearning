package tk7;
//import net.toollib.*;

class Shape{
	Shape(int i){
		System.out.println("shape construct");
	}
	void dispose() {
		System.out.println("shape disposed");
	}
}
class Circle extends Shape{
	Circle(int i){
		super(i);
		System.out.println("draw circle");
	}
	void dispose() {
		System.out.println("erase circle");
		super.dispose();
	}
}
class Triangle extends Shape{
	Triangle(int i){
		super(i);
		System.out.println("Draw Triangle");
		}
	void dispose() {
		System.out.println("eraise Triangle");
		super.dispose();
	}
}
class Line extends Shape{
	private int startPoint;
	private int endPoint;
	Line(int i,int j){
		super(i);
		this.startPoint=i;
		this.endPoint=j;
		System.out.println("draw line");
	}
	void dispose() {
		System.out.println("eraise line");
		super.dispose();
	}

}
class CADConstruct extends Shape{
	private Circle c1;
	private Triangle t1;
	private Line[] l1=new Line[3];
	CADConstruct(int i) {
		super(i);
		c1=new Circle(i+3);
		t1=new Triangle(i+6);
		l1=new Line[]{
		new Line(i,88),new Line(i,99),new Line(i,33)
		};
		System.out.println("combine draw");
	}
	public void dispose() {
		c1.dispose();
		t1.dispose();
		for(int i=0;i<l1.length;i++) {
			l1[i].dispose();
			System.out.println("all dispose");
		}
		super.dispose();
	}
}
/**
 * <h1 title="18年12月看不明白">一个垃圾回收模拟</h1>
 * 
 * @author ppll
 *
 */
public class GabageClean {
	public static void main(String[] argsA) {
		System.out.println("hello");
		CADConstruct x1=new CADConstruct(3);
		try {}finally {x1.dispose();};
	}

}

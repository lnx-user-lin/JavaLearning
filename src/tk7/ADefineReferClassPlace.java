package tk7;
import net.toollib.*;

class Bowl{
	private String s="a bowl";
	public Bowl() {
		Print.print("Bowl()");
	}
	public String toString() {
		return s;
	}
}
/**
 *<h>引用对象初始化的一般位置</h> 
 *<p>A.在定义时立刻初始化</p>
 *<p>B.在构造函数内初始化</p>
 *<p>C.在使用前初始化</p>
 *<p>D.使用实例初始化</p>
 * @author plasma
 *
 */
public class ADefineReferClassPlace {
	//A方式
	private String 
	s1="ss1",
	s2="s2",
	s3,
	s4;
	private Bowl neb;
	private int i;
	private float toy;
	//B方式
	public ADefineReferClassPlace() {
		Print.print("inside ADefineRefereClassPlace");
		s3="joy";
		toy=3.14f;
		neb=new Bowl();
	}
	//D方式
	{i=48;}
	public String toString() {
		if(null==s4) {
			
		}
		return
				"s1"+s1+"\n"+
				"s2"+s2+"\n"+
				"s3"+s3+"\n"+
				"s4"+s4+"\n"+
				"i"+i+"\n"+
				"toy"+toy+"\n"+
				"neb"+neb+"\n";
	}
	public static void main(String...args) {
		ADefineReferClassPlace bb=new ADefineReferClassPlace();
		Print.print(bb);
	}
}

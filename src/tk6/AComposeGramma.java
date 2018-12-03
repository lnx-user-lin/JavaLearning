package tk6;

class WaterFall{
	private String water;
	public WaterFall() {
		System.out.println("construtor");
		water="constructor";
	}
	public String toString() {
		return water;
	}
}
/**
 * 了解tostring（）方法在方法内的意义<p>
 * 区分未初始化和初始化的对象<p>
 * 未初始化对象是null，无法调用任何内部数据和方法
 * @author plasma
 *
 */
public class AComposeGramma {
	private String valve1,valve2,valve3,valve4,valve5;
	private WaterFall w3=new WaterFall();
	private int i;
	private float f;
	/**
	 * 当编译器需要一个String而我只有一个对象时调用toString（）
	 */
	public String toString() {
		return 
		"value1="+valve1+
		"value2="+valve2+"/n"+
		"i="+i+"f="+f+
		"w3="+w3;
				
	}
	public static void main(String...args) {
		AComposeGramma acg=new AComposeGramma();
		//acg.toString();
		//acg.w3.toString();
		System.out.println(acg);
		System.out.println(acg.w3);
		AComposeGramma bgc;
		//System.out.println(bgc);//bgc未初始化，无法调用内部数据或方法
	}

}

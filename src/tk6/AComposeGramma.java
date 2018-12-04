package tk6;

class WaterFall{
	private String water;
	public WaterFall() {
		System.out.println("construtor");
		water="constructor";
	}
	public String testNullClass() {
		return "methoud can use";
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
	
	//
	private WaterFall w3=new WaterFall();	
	/*若引用的对象waterfall未初始化，
	则自动初始化为null，
	调用waterfall的方法或成员时出错*/
	
	private WaterFall w4;
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
		AComposeGramma dgc=new AComposeGramma();
		/*
		 * 虽然w4未初始化，但仍然可以使用tostring并返回一个null
		 * */
		System.out.println(dgc.w4);
		/*
		 * w4未初始化不能使用方法testNullClass
		 * */
		System.out.println(acg.w4.testNullClass());
		System.out.println(acg.w3.testNullClass());
	}

}

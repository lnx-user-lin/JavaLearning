package tk6;

class Connection{
	private int i=0;
	private static int total=0;
	private Connection() {System.out.println("A Connection create");}
	public static Connection makeConnection() {
		total=total+1;
		return new Connection();
	}
	public static int showTotal() {
		return total;
	}
}
class UnSecuratyClass{
	private int i=5;
}
/**
 * 重要
 * <p>
 * 使用私有的构造函数可以阻止类被滥用
 * <p>
 * 私有的构造函数可以使用静态接口调用
 * <p>
 * 如果想要保护数据，必须明确声明私有化构造函数，否则会使用默认构造函数，其权限是公共的
 * <p>
 * 建议打开源代码复习
 * @author plasma
 *
 */
public class ConnectionMenager {

	//Integer[] isa;
	//Connection[] c2=new Connection();//构造函数是private的
	static int cMTotal=3;
	static Connection[] c3=new Connection[3] ;
	{
		/*注意对象数组的大括号前面有“;”*/
		//初始化一个private对象数组的方法
		for(Connection x:c3) {
			x=Connection.makeConnection();
			}
	};
	/*
	static Connection[] c4= {
			for(Connection s:c4) {
				s=getConnection();
			}
	};
	这个初始化形式不可使用
	*/
	static Connection[] c5= {
			Connection.makeConnection(),
			Connection.makeConnection(),
			Connection.makeConnection()};
	/*
	 *对比C3和C5的初始化方式 
	 * */
	public static Connection getConnection() {
		if(cMTotal>0) {
			return c3[--cMTotal];
		}else {
			System.out.println("no connection object");
			return null;
		}
	}
	public static void main(String...args) {
		ConnectionMenager cm=new ConnectionMenager();
		System.out.println(cMTotal);
		getConnection();
		System.out.println(cMTotal);
		getConnection();
		System.out.println(cMTotal);
		getConnection();
		getConnection();
		UnSecuratyClass us=new UnSecuratyClass();
		/*
		 * 
		 * 
		 * */

		System.out.println(us);
		
	}

}

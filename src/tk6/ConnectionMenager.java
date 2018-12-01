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
public class ConnectionMenager {
	//Integer[] isa;
	//Connection[] c2=new Connection();//构造函数是private的
	static int cMTotal=3;
	static Connection[] c3=new Connection[3] ;{/*注意对象数组的大括号前面有“;”*/
		//初始化一个private对象数组的方法
		for(Connection x:c3) {
			x=Connection.makeConnection();
		}
			
	};
	public static Connection getConnection() {
		if(cMTotal>=0) {
			for(Connection s:c3) {
				return s;
			}
		}else {
			System.out.println("no connection object");
			return null;
		}
	}

}

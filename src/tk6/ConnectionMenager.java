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
	Integer[] isa;
	Connection[] c2=new Connection();//
	Connection[] c3=new Connection[3] ;
	{
		for(Connection x:c3) {
			x=Connection.makeConnection();
		}
			
	};

}

package tk6;

public class Exercise19 {
	static void getString(String...str) {
		System.out.println("A string arrays has been "
				+ "acquired");
		for(String s:str) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String[] tmp=new String[]{"urg","dfgvv"};
		getString("ddkfl","sdfg4","sdddd");
		getString(tmp);
	}

}

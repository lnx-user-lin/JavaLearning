package tokk03;

public class ObjectArrays {
	public ObjectArrays(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		ObjectArrays[] obj=new ObjectArrays[] {
				new ObjectArrays("sdf"),
				new ObjectArrays("jcj")
		};
		System.out.println("finished");
	}

}

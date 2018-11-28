package tokk03;
/**A method that exprain the word "this"
 *constructor within a this word 
 * 
 * 
 * @author plasma
 *@version 1.0
 */
public class Flower {
	private int petalCount=0;
	private String s=new String("null");
	/**
	 * a constructor with an interger proterfor
	 * 
	 * @param petals this is the count of flower
	 */
	Flower(int petals){
		System.out.println("Constructor w/ int arg only,petalCount= "
				+petalCount);
	}
	/**
	 * recover Flower constructor
	 * @param ss it is the name of the flower
	 */
	Flower(String ss){
		System.out.println("Constructor w/ String arg only,s= "+ss);
		s=ss;
	}
	Flower(String s,int petal){
		this(petal);
		this.s=s;
		System.out.println("String &int args");
	}
	Flower(){
		this("hi",47);
		System.out.println("Default constructor (no args)");
	}
	void print() {
		System.out.println("petalCount="+ petalCount+"s="+s);
	}
	public static void main(String[] args) {
		Flower x=new Flower();
		x.print();
	}
}

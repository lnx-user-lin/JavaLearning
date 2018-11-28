package tokk03; 
/**a class can change a char's inside
 * @auther plasma
 * @version 1
 */

/**
 * class Aletter only has a char
 * @return return nothing
 */

/**
 * main class
 * @return nothing
 * it has a static mathode
 */
public class CharChange{
	public static void charChange(Aletter y){
		y.ch='s';
	}
	/**
	 * @prama kkk no usage
	 * @return nothing return
	 *
	 */
	public static void main(String[] kkk){
		Aletter k=new Aletter();
		k.ch='d'; 
		System.out.println("first"+k.ch);
		charChange(k);
		System.out.println("second"+k.ch);
	}
}


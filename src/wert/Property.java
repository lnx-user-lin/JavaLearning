package wert;

//:Proterty.java
import java.util.*;
/**The first thinking inJava example program.
 * Lists system information on curent machine.
 * @author plasma
 *@version 1.0
 */
public class Property {
	/**Sole entry point to class and application
	 * @param kkkk array of string atguments
	 * @return No return value
	 * @exception exceptions No exceptions throw
	 */
	public static void main(String[] kkkk) {
		System.out.println(new Date());
		Properties p=System.getProperties();
		p.list(System.out);
		System.out.println("---Memory Usage:");
		Runtime rt=Runtime.getRuntime();
		System.out.println("total Memory="
				+rt.totalMemory()+
				"Free Memory ="
				+rt.freeMemory());
	}
}///:`

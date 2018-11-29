package wert;

/**
 * 用来区分protected和private和friendly（包访问权限）的类
 * @author plasma
 *@see wert.TestClassUse
 */
public class TestClass {
	/**
	 *f（）可以在子类继承，继承后可以在任何包内使用 
	 */
	protected void f() {
		System.out.println("protected mathoud can use");
	}
	/**
	 * g（）是公有接口，所有的地方可用
	 */
	public void g() {
		System.out.println("public methoud can use");
	}
	/**
	 * h（）是包访问权限，只有在本包内可以使用
	 */
	void h() {
		System.out.println("package access can use");
	}
}

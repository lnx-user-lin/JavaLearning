package wert;
/**
 * 同包内可以使用protected的和包访问权限的
 * @author plasma
 *@see wert.TestClass
 */
public class TestClassUse {

	public static void main(String[] args) {
		TestClass m=new TestClass();
		m.f();
		m.g();
		m.h();
	}
}

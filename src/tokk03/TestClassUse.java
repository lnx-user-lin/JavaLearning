package tokk03;

import wert.TestClass;

public class TestClassUse {
	public static void main(String[] args) {
		TestClass m=new TestClass();
		//m.f();无法使用
		m.g();
		//m.h();无法使用
	}
}

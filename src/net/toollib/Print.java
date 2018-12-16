package net.toollib; 
import java.io.*;
/**
 * 简化输出的工具
 * @author dell
 *
 */
public class Print {
	/**
	 * 单行输出单个字符串，输出后不换行
	 * @param str 
	 */
	public static void print(Object str) {
		System.out.print(str);
	}
	/**
	 * 单行输出单个字符串，输出后换行
	 * @param str 
	 */
	public static void println(Object str) {
		System.out.println(str);
	}
	/**
	 * 单行输出字符串列表，中间以空格间隔开，输出后不换行
	 * @param args
	 */
	public static void print(Object...args) {
		for(Object str:args) {
			System.out.print(str+" ");
		}
	}
	/**
	 *  输出连续字符串列表，每个对象占用一行
	 * @param args
	 */
	public static void println(Object...args) {
		for(Object str:args) {
			System.out.println(str);
		}
	}
	/*public static void println() {
		System.out.println();
	}*/

}

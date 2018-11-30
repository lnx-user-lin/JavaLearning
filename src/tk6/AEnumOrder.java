package tk6;

enum Bkss{
	NOT,MILD,MEDIUM,HOT,FLAMING
}
/**
 * 小程序表明枚举类型的.values（）的用法
 * <p>
 * 用以创建数组
 * <p>
 * .ordinal（）用来返回枚举的元素的对应整型
 * <p>
 * 枚举类型的所有对象都是常量，使用大写字母，两个单词用_隔开
 * <p>
 * @author plasma
 *
 */
public class AEnumOrder {
	public static void main(String [] args) {
		for(Bkss s:Bkss.values()) {
			System.out.println(s+",ordinal:"+s.ordinal());
		}
	}

}

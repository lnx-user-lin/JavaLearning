package tk6;
/**
 * 注意values的用法，可以产生一个枚举类的数组，使用foreach得到每一个元素
 * @author plasma
 *
 */
enum Doller{
	ONE,TWO,FIVE,TEN,TWENTY,FIFTY,ONE_HUNDUER
}
public class Excercise21 {
	public static void prt(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		for(Doller d:Doller.values()) {
			System.out.println(d+"'s ordinal is "+d.ordinal());
			switch(d) {
			case ONE:prt("1 dollers");
				break;
			case TWO:prt("2 dollers");
				break;
			case FIVE:prt("5 dollers");
				break;
			case TEN:prt("10 dollers");
				break;
			case TWENTY:prt("20 dollers");
				break;
			case FIFTY:prt("50 dollers");
				break;
			case ONE_HUNDUER:prt("100 dollers");
				break;
			}
		}
	}

}

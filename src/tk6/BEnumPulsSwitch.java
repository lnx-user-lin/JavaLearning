package tk6;
/**
 * 枚举类型和Switch可以很好的配合使用
 * 注意this的用法
 * @author plasma
 *
 */
public class BEnumPulsSwitch {
	Dkss degree;
	public BEnumPulsSwitch(Dkss degree) {
		this.degree=degree;
	}
	public void describe() {
		switch(degree) {
		case NOT:System.out.println("not spicy at all");
		break;
		case MILD:
		break;
		case MEDIUM:System.out.println("a little hot");
		break;
		case HOT:
			break;
		case FLAMING:
			break;
		default:System.out.println("maybe too hot");
		}
	}
	public static void main(String[] args) {
		BEnumPulsSwitch plain=new BEnumPulsSwitch(Dkss.NOT),
				greenChile=new BEnumPulsSwitch(Dkss.MEDIUM),
				jalPeno=new BEnumPulsSwitch(Dkss.HOT);
		plain.describe();
		greenChile.describe();
		jalPeno.describe();
	}

}

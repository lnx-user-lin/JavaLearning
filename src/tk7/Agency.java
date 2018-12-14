package tk7;
import net.toollib.*;

class MoveControu{
	String up(Integer i){
		return "move up"+i.toString();
	}
	String down(Integer i) {
		return "movie down"+i.toString();
	}
}
/**
 * <h1><em Style="color:blue">复用类第三种</em>：代理</h1>
 * <h2>用法</h2>
 * <ul>
 * <li>创建私有父类对象</li>
 * <li>接口对应父类的方法，使用成员对象访问</li>
 * <li></li>
 * <li></li>
 * </ul>
 * @author ppll
 *
 */
public class Agency {
	private MoveControu move=new MoveControu();
	public String moveUp(Integer i) {
		return move.up(i);
	}
	public String moveDown(Integer i) {
		return move.down(i);
	}
	public static void main(String[] args) {
		Agency a=new Agency();
		Print.println(a.moveUp(100));
		Print.println(a.moveDown(544));
	}
}

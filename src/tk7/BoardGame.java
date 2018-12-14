package tk7;
import net.toollib.*;
class Game{
	Game(int i){
		Print.println("Game construct");
	}
}
/**
 *<h1 style="color:red;font-family:sans-serif">父类含有带参数的构造器</h1> 
 *<ul>
 *<li>利用super调用父类构造器</li>
 *<li title="否则编译器出错">子类构造器最先调用super</li>
 *<li></li>
 *<li></li>
 * @author ppll
 *
 */
public class BoardGame extends Game{
	public BoardGame(int i) {
		super(i);
		Print.println("BoardGame Construct");
	}
	public static void main (String[] args) {
		BoardGame gam=new BoardGame(1);
	}

}

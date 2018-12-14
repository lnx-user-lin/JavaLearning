package tk7; import net.toollib.*;

class Basse{
	Basse(int i){
		Print.println("Basse creat");
	}
		
}
public class Tk7Exercise8 extends Basse{
	public Tk7Exercise8() {
		super(1);
		Print.println("default Constructor");
	}
	public Tk7Exercise8(int i) {
		super(2);
		Print.println("new Constructor");
	}
	public static void main(String[] args) {
		
		Tk7Exercise8 e1=new Tk7Exercise8();
		Tk7Exercise8 e2=new Tk7Exercise8(3);
	}

}

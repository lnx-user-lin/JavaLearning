package tk7;

class Amphibia {
	public void aMathoud(){
		System.out.println("A");
	}	
	public void bMathoud(){
		System.out.println("B");
	}
	public static void turn(Amphibia i){
		i.aMathoud();
		i.bMathoud();
	}
}
class Frog extends Amphibia{

}
public class ExerciseSixteen {

public static void main(String[] args){
	Frog f1 =new Frog();
	Amphibia.turn(f1);
}
}

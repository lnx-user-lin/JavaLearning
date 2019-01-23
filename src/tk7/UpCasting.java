package tk7;

class Instrument {
	public void play() {}
	static void turn(Instrument i) {
		i.play();
	}
}
class Wind extends Instrument {
	
}
public class UpCasting {
	public static void main(String[] args) {
		Wind ws =new Wind();
		Instrument.turn(ws);
	}
}

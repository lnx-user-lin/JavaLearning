package tokk03;

class Chair{
	static boolean gcrun=false;
	static boolean f=false;
	static int created=0;
	static int finalized=0;
	int i=0;
	Chair(){
		i=++created;
		if(47==created) {
			System.out.println("Created 47");
		}
	}
	protected void finalize() {
		if(!gcrun) {
			gcrun=true;
			System.out.println("Begining to finalize after"+
			created+"Chairs have been created");
		}
		if(47==i) {
			System.out.println("Finalizing Chair #47, "+"Setting flag to stop Chair creationb");
			f=true;
		}
		finalized++;
		if(finalized>=created) {
			System.out.println("all"+finalized+"finalized");
		}
	}
}
public class Garbage {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	if(0==args.length) {
		System.err.println("Usage: \n"+"java Garbage before\n or:\n"+"java Garbage after");
		return;
	}
	while (!Chair.f) {
		new Chair();
		new String("To take up space");
		}
	System.out.println("After all Chairs have been cteated:\n"+"Total created= "
		+Chair.created
		+"total finalized = "
		+Chair.finalized);
	if(args[0].equals("before")) {
		System.out.println("gc():");
		System.gc();
		System.out.println("runFinalization():");
		System.runFinalization();
	}
	System.out.println("bye!");
	if(args[0].equals("after")) {
		System.runFinalizersOnExit(true);
	}
	}
}

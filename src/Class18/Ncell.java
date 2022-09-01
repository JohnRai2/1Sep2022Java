package Class18;

public class Ncell implements /*extends*/ Sim {
	@Override
	public void call() {
		System.out.println("Calling using Ncell...");
	}

	@Override
	public void data() {
		System.out.println("Surfing internet using Ncell");
	}
}

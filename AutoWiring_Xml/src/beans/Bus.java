package beans;

public class Bus {

	private Engine engine;

	public Bus(Engine engine) {
		this.engine = engine;
	}
	
	public void disp()
	{
		System.out.println("engine model year is  "+engine.getModelyear());
	}
	
	
}

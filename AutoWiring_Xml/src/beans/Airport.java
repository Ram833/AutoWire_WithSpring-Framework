package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Airport {

	@Autowired
	@Qualifier("e1")
	private Plane plane;
	
	public void disp()
	{
		System.out.println("the plane model no is  "+plane.getModelyear());
	}
	
}

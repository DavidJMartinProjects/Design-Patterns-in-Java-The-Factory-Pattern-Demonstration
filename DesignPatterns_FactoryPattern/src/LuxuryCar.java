
public class LuxuryCar extends Car {
	public LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}

	// implementation of abstract method in parent class
	protected void construct() {
		System.out.println("Building Luxury Car...");		
	}
}

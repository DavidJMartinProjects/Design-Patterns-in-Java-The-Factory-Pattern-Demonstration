
public class LuxuryCar extends Car implements CarBehaviour {
	public LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}

	//override base class construct() method
	public void construct() {
		System.out.println("Building Luxury Car Class...");
	}
	//implement interface methods 
	public void drive() {
		System.out.println("Luxury Car is Driving..");
	}
	
}

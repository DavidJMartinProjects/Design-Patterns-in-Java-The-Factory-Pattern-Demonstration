
public class SedanCar extends Car implements CarBehaviour {
	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	//override base class construct() method
	public void construct() {
		System.out.println("Building Sedan Car Class...");
	}
	//implement interface methods 
	public void drive() {
		System.out.println("Sedan Car is Driving..");
	}
}

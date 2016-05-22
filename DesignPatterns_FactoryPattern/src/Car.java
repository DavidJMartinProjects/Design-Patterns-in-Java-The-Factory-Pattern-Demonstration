// Car.java is an abstract class & the parent class of all car instances and it will also contain the common behaviour and attributes for all objects of type Car

public abstract class Car {	
	private CarType model = null;
	
	public Car(CarType model) {
		this.model = model;
	}	
	
	//abstract construct() method 
	protected abstract void construct();
	
	// getters and setters
	public CarType getModel() {
		return model;
	}
	public void setModel(CarType model) {
		this.model = model;
	}
}

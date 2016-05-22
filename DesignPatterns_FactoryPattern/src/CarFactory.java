// the CarFactory class will instantiate a car instance after determining its type
public class CarFactory {

	public static Car buildCar(CarType model) {
		Car car = null;

		switch (model) {
			case SMALL: {
				car = new SmallCar();
				break;
			}
			case SEDAN: {
				car = new SedanCar();
				break;
			}
			case LUXURY: {
				car = new LuxuryCar();
				break;
			}
			default: {
				System.out.println("Car Model Not Found!");
				break;
			}
		}
		return car;
	}
}

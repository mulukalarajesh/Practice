class Car{
	private String carID;
	
	private String carModel;
	
	public String getCarID() {
		return carID;
	}
	public void setCarID(String carID) {
		this.carID = carID;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	@Override
	public String toString() {
		return "Car [carID=" + carID + ", carModel=" + carModel + "]";
	}
	
}

class SportsCar extends Car{
	
	private String carBrand;
	
	private String carManfacturer;
	
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarManfacturer() {
		return carManfacturer;
	}
	public void setCarManfacturer(String carManfacturer) {
		this.carManfacturer = carManfacturer;
	}
	@Override
	public String toString() {
		return "SportsCar [carBrand=" + carBrand + ", carManfacturer=" + carManfacturer + "]";
	}
	
	
}
public class Inheritence3 {
public static void main(String[] args) {
	Car c=new Car();
	
	c.setCarID("001");
	c.setCarModel("petrol");
	
	System.out.println(c.toString());
	
	SportsCar sc=new SportsCar();
	sc.setCarID("002");
	sc.setCarBrand("creta");
	sc.setCarManfacturer("honda");
	sc.setCarModel("diesel");
	System.out.println(sc.toString());
}	
}

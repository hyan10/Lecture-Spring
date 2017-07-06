package DI01_2;

public class Car {
	private Tire tire;
	
	public Car() {
	}

	public Car(Tire tire) {
		this.tire = tire;
	}
	
	public String getTireBrand(){
		return "장착된 타이어: "+tire.getBrand();
	}
	
}

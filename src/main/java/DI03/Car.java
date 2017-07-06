package DI03;

public class Car {
	private Tire tire;
	
	public String getTireBrand(){
		return "장착된 타이어: "+tire.getBrand();
	}

	public void setTire(Tire tire) {
		System.out.println("setter 메서드 실행");
		this.tire = tire;
	}
	
	public void setTire1(Tire tire) {
		System.out.println("setTire1 메서드 실행");
		this.tire = tire;
	}
	
	
	
}

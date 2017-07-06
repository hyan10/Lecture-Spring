package DI01_1;

public class Car {
	private Tire tire;
	
	public Car(){
		tire = new KoreaTire(); 	// 의존관계 발생
		tire = new AmericaTire();
	}
	
	public String getTireBrand(){
		return "장착된 타이어: "+tire.getBrand();
	}
}

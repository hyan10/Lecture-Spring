package DI05;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	@Autowired
	private Tire tire;
	
/*	public Car(){
		System.out.println("기본 생성자 호출");
	}
	
//	@Autowired
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(tire) 매개변수 생성자 호출");
	}


//	@Autowired
	public void setTire(Tire tire) {
		System.out.println("setter 메서드 실행");
		this.tire = tire;
	}

//	@Autowired
	public void setTire1(Tire tire) {
		System.out.println("setTire1 메서드 실행");
		this.tire = tire;
	}
 */
	
	public String getTireBrand(){
		return "장착된 타이어: "+tire.getBrand();
	}
	
	
}

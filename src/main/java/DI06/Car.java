package DI06;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
//	@Resource
	private Tire tire;
	
	public Car(){
		System.out.println("기본 생성자");
	}
	
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(tire) 생성");
	}


	@Resource
	public void setTire(Tire tire) {
		System.out.println("setter 호출");
		this.tire = tire;
	}

	public void setTire1(Tire tire) {
		System.out.println("setTire1 호출");
		this.tire = tire;
	}
 
	
	public String getTireBrand(){
		return "장착된 타이어: "+tire.getBrand();
	}
	
	
}

package DI07;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {


//	@Resource
	@Autowired(required=false)  // xml에 존재하지 않으면 null 주고 넘어감
	private Tire tire;


/*	@Autowired
	@Qualifier("koreaTire")
	private Tire tire;*/

/*	@Resource(name="americaTire")
	private Tire tire;
	*/
/*	public Car(){
		System.out.println("기본 생성자");
	}*/
	
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(tire) 생성");
	}

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

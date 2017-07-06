package DI09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("kia")
public class KiaMaker implements CarMaker {

	@Autowired
	private Car car;

	public KiaMaker() {
		super();
	}

/*	public KiaMaker(Car car) {
		super();
		this.car = car;
	}*/

	public Car getCar() {
		return car;
	}

	/*public void setCar(Car car) {
		this.car = car;
	}*/

	@Override
	public void sell(Money money) {
		car.setName("k5");
		System.out.println(car.getName() + "을 ");
		System.out.println(money.getAmount() + "원으로 팜");
	}

}

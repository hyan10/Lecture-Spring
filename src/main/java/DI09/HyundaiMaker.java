package DI09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("hyundai")
public class HyundaiMaker implements CarMaker {

	@Autowired
	private Car car;

	public HyundaiMaker() {
		super();
	}

/*	public HyundaiMaker(Car car) {
		super();
		this.car = car;
	}*/

	@Override
	public void sell(Money money) {
		car.setName("그렌저");
		System.out.println(car.getName() + "를 ");
		System.out.println(money.getAmount() + "원으로 팜");
	}

}

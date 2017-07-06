package DI09;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderManager {
	
/*	@Autowired
	@Qualifier("kia")*/
	@Resource(name="kia")
	private CarMaker carMaker;
	
	@Autowired
	private Money money;
	
	public OrderManager() {
		super();
	}

	public CarMaker getCarMaker() {
		return carMaker;
	}
/*
	public void setCarMaker(CarMaker carMaker) {
		this.carMaker = carMaker;
	}

	public OrderManager(CarMaker carMaker, Money money) {
		super();
		this.carMaker = carMaker;
		this.money = money;
	}*/

	public Money getMoney() {
		return money;
	}

	/*public void setMoney(Money money) {
		this.money = money;
	}*/
	
	public void order(){
		money.setAmount(3000);
		carMaker.sell(money);
	}
	
}

package DI09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CarOrderMain {

	public static void main(String[] args) {
		
	/*	Car car = new Car();
		CarMaker carMaker = new KiaMaker(car);  // setCar() 못함. interface라 그런가??
		Money money = new Money();
		OrderManager manager = new OrderManager(carMaker, money);
		manager.order();
	*/
		
		ApplicationContext context = new GenericXmlApplicationContext("di09.xml");
		OrderManager manager = context.getBean("orderManager", OrderManager.class);
		manager.order();		
		
	}

}

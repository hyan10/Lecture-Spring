package DI06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @Resource
 */

public class DriverMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("di06.xml");
		Car car = context.getBean("car", Car.class);
		System.out.println(car.getTireBrand());
	

	}

}

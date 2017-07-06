package DI04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 스프링을 이용한 DI - 생성자 주입방식
 *  - 사용자가 쇼핑센터에서 자동차 구매
 *  - 쇼핑센터가 타이어 주문
 *  - 쇼핑센터에서 주문한 타이어가 장착된 자동차 주문
 *  - 쇼핑센터에서 타이어가 장착된 자동차를 배달
 */

public class DriverMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("di04.xml");
		
	//	Tire tire = (Tire)context.getBean("koreaTire");
		Car car = (Car)context.getBean("car");
		System.out.println(car.getTireBrand());

	}

}

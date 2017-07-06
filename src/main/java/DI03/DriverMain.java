package DI03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
 * 스프링을 이용한 DI - 속성 주입방식(Setter Injection)
 *  - 사용자가 쇼핑센터에서 자동차 구매
 *  - 쇼핑센터가 자동차 주문
 *  - 쇼핑센터가 타이어 주문
 *  - 쇼핑센터에서 자동차에 타이어를 장착
 *  - 쇼핑센터에서 타이어가 장착된 자동차를 배달
 */

public class DriverMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("di03.xml");
		
		// �Ӽ� DI �߻�
		Car car = (Car)context.getBean("car");
		System.out.println(car.getTireBrand());

	}

}

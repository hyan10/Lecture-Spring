package DI07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @Autowired, @Resource 어노테이션 비교
 * 
 * @Autowired - 스프링프레임워크가 제공하는 어노테이션
 * @Resource - 자바에서 제공하는 어노테이션
 * 
 * 객체 찾기 우선순위
 *  @Autowired - type 매칭 후 id 매칭
 *  @Resource - id 매칭 후 type 매칭
 *  
 */

public class DriverMain {

	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("di07.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("di07-1.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("di07-2.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("di07-3.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("di07-4.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("di07-5.xml");
		Car car = context.getBean("car", Car.class);
		System.out.println(car.getTireBrand());
	

	}

}

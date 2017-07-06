package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloMain02 {
	public static void main(String[] args) {
		
		String xmlLocation = "classpath:beanContainer.xml";
		
		// 객체를 먼저 모두 만든다.
		// 나중에 만들고 싶으면 xml 파일에서 해당 bean에 lazy-init="true" 속성을 추가한다.
		
		// ver1.
//		ApplicationContext context = new ClassPathXmlApplicationContext("beanContainer.xml");
								// new GenericApplicationContext();
	
		// ver2.
//		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beanContainer.xml");
		
		// ver3.
//		ApplicationContext context = new ClassPathXmlApplicationContext(xmlLocation);
	
		// ver4.
		ApplicationContext context = new FileSystemXmlApplicationContext(xmlLocation);
		
		// 만들어진 객체를 가져와서 쓴다.
		Hello obj = (Hello)context.getBean("hello");
		obj.printMsg();
		
		Hello obj2 = (Hello)context.getBean("hello2");
		obj2.printMsg();
		
	}
}

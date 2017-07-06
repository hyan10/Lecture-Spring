package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloMain02 {
	public static void main(String[] args) {
		
		String xmlLocation = "classpath:beanContainer.xml";
		
		// ��ü�� ���� ��� �����.
		// ���߿� ����� ������ xml ���Ͽ��� �ش� bean�� lazy-init="true" �Ӽ��� �߰��Ѵ�.
		
		// ver1.
//		ApplicationContext context = new ClassPathXmlApplicationContext("beanContainer.xml");
								// new GenericApplicationContext();
	
		// ver2.
//		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beanContainer.xml");
		
		// ver3.
//		ApplicationContext context = new ClassPathXmlApplicationContext(xmlLocation);
	
		// ver4.
		ApplicationContext context = new FileSystemXmlApplicationContext(xmlLocation);
		
		// ������� ��ü�� �����ͼ� ����.
		Hello obj = (Hello)context.getBean("hello");
		obj.printMsg();
		
		Hello obj2 = (Hello)context.getBean("hello2");
		obj2.printMsg();
		
	}
}

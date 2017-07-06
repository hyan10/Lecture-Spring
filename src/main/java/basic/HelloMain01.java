package basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloMain01 {
	
	public static void main(String[] args) {
	/*
		Hello obj = new Hello();
		obj.printMsg();
	*/
		
		// classPath = src/main/resources
	//	Resource resource = new ClassPathResource("beanContainer.xml");
		Resource resource = new FileSystemResource("src/main/resources/beanContainer.xml");
		
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		// hello ã�Ƽ� ������ ��ü ������
		Hello obj = (Hello) factory.getBean("hello");
		obj.printMsg();
		
		// hello ã�Ҵµ� ��������� �����ϱ� �ִ°� ���پ�
		Hello obj2 = (Hello) factory.getBean("hello");
		obj2.printMsg();
		
		// ���� ��ü���� �ٸ� ��
		Hello obj3 = (Hello) factory.getBean("hello2");
		
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}

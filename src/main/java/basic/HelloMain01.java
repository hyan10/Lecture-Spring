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
		
		// hello 찾아서 없으면 객체 생성함
		Hello obj = (Hello) factory.getBean("hello");
		obj.printMsg();
		
		// hello 찾았는데 만들어진거 있으니까 있는거 갖다씀
		Hello obj2 = (Hello) factory.getBean("hello");
		obj2.printMsg();
		
		// 같은 객체지만 다른 값
		Hello obj3 = (Hello) factory.getBean("hello2");
		
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}

package AOP02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AOPMain {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("aop02.xml");
		
		Person boy = context.getBean("boy", Person.class);
		
		boy.runSomething();
		
		Person girl = context.getBean("girl", Person.class);
		
		girl.runSomething();
	}

}

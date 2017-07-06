package DI_TEST01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalMain {

	public static void main(String[] args) {
		
		// 10, 2 �� ������ ��Ģ���� ����� ����ϴ� �ڵ� �ۼ� (������ ����� DI ��� ����)
		
		// 1. �����ڿ� �� �ֱ�
		ApplicationContext context = new ClassPathXmlApplicationContext("calculator1.xml");
		
		System.out.println("MyCalculator(2,10,cal)");
		MyCalculator mc = (MyCalculator)context.getBean("myCal");
		mc.add();
		mc.sub();
		mc.mul();
		mc.div();
		
		
		// 2. setter�� �ֱ�
		context = new ClassPathXmlApplicationContext("calculator2.xml");
		
		System.out.println("MyCalculator(2,10), setCal()");
		mc = (MyCalculator)context.getBean("myCal");
		mc.add();
		mc.sub();
		mc.mul();
		mc.div();

		
		// 3. cal�� �����ڷ� �ޱ�
		context = new ClassPathXmlApplicationContext("calculator3.xml");
		System.out.println("MyCalculator(cal), setFN(), setSN()");
	//	mc = (MyCalculator)context.getBean("myCal");
		mc = context.getBean("myCal", MyCalculator.class);
	//	mc = new MyCalculator(2,10);
		mc.setFirstNum(2);
		mc.setSecondNum(10);
		
		mc.add();
		mc.sub();
		mc.mul();
		mc.div();
	}

}

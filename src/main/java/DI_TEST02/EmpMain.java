package DI_TEST02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("di_test02_empContainer.xml");
		Develope dev = context.getBean("develope", Develope.class);
		dev.work();

	}
	
	/* 
	 * 출력 결과
	 * 프로그래머/디자이너 출근했다
	 * 개발한다
	 * 프로그래머/디자이너 퇴근했다
	 * 
	 */

}

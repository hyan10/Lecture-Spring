package DI08;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SetMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di08-2.xml");

		SetAddress set = context.getBean("set", SetAddress.class);
		
		Set<String> address = set.getAddress();
		for(String addr : address){
			System.out.println(addr);
		}

	}

}

package DI08;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MapMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di08-3.xml");

		MapAddress map = context.getBean("map", MapAddress.class);
		
		
		Map<String, String> address = map.getAddress();
		Set<Entry<String, String>> entry = address.entrySet();
		Set<String> keys = address.keySet();
		for(String key : keys){
			System.out.println(address.get(key));
		}

	}

}

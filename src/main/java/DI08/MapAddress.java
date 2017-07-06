package DI08;

import java.util.Map;

public class MapAddress {
	private Map<String, String> address;

	public MapAddress() {
		super();
		System.out.println("기본 생성자");
	}	
	
	public MapAddress(Map<String, String> address) {
		super();
		this.address = address;
		System.out.println("생성자 주입");
	}

	public Map<String, String> getAddress() {
		return address;
	}

	public void setAddress(Map<String, String> address) {
		this.address = address;
		System.out.println("속성 주입");
	}

	
}

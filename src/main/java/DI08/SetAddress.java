package DI08;

import java.util.Set;

public class SetAddress {
	private Set<String> address;

	
	
	public SetAddress() {
		super();
	}



	public SetAddress(Set<String> address) {
		super();
		this.address = address;
		System.out.println("SetAddress() 생성자 호출");
	}


	

	public void setAddress(Set<String> address) {
		this.address = address;
		System.out.println("setAddress() 호출");
	}



	public Set<String> getAddress() {
		return address;
	}
	
	
}

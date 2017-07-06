package DI08;

import java.util.List;

public class ListAddress {
	private List<String> address;

	
	
	public ListAddress() {
		super();
	}



	public ListAddress(List<String> address) {
		super();
		this.address = address;
		System.out.println("ListAddress() 생성자 호출");
	}


	

	public void setAddress(List<String> address) {
		this.address = address;
		System.out.println("setAddress() 호출");
	}



	public List<String> getAddress() {
		return address;
	}
	
	
}

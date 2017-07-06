package DI_TEST02;

import org.springframework.stereotype.Component;

@Component
public class Developer implements Worker{
	
	String name;
	
	public Developer() {
		super();
		name="개발자";
	}

	public Developer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void start(){
		System.out.println(name+" 출근");
	}
	
	public void end(){
		System.out.println(name+" 퇴근");
	}
	
	
}

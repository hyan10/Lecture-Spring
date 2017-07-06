package DI_TEST02;

import org.springframework.stereotype.Component;

@Component
public class Designer implements Worker {

	String name;

	public Designer() {
		super();
		name = "디자이너";
	}

	public Designer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void start() {
		System.out.println(name + " 출근");
	}

	@Override
	public void end() {
		System.out.println(name + " 퇴근");
	}

}

package DI05;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	@Autowired
	private Tire tire;
	
/*	public Car(){
		System.out.println("�⺻ ������ ȣ��");
	}
	
//	@Autowired
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(tire) �Ű����� ������ ȣ��");
	}


//	@Autowired
	public void setTire(Tire tire) {
		System.out.println("setter �޼��� ����");
		this.tire = tire;
	}

//	@Autowired
	public void setTire1(Tire tire) {
		System.out.println("setTire1 �޼��� ����");
		this.tire = tire;
	}
 */
	
	public String getTireBrand(){
		return "������ Ÿ�̾�: "+tire.getBrand();
	}
	
	
}

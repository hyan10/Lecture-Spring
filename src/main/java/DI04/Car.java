package DI04;

public class Car {
	private Tire tire;
	
	public Car(Tire tire) {
		System.out.println("Car(tire) ȣ��");
		this.tire = tire;
	}

	public String getTireBrand(){
		return "������ Ÿ�̾�: "+tire.getBrand();
	}

	public void setTire(Tire tire) {
		System.out.println("setter �޼��� ����");
		this.tire = tire;
	}
	
	public void setTire1(Tire tire) {
		System.out.println("setTire1 �޼��� ����");
		this.tire = tire;
	}
	
	
	
}

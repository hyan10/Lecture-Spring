package DI01_1;

public class Car {
	private Tire tire;
	
	public Car(){
		tire = new KoreaTire(); 	// �������� �߻�
		tire = new AmericaTire();
	}
	
	public String getTireBrand(){
		return "������ Ÿ�̾�: "+tire.getBrand();
	}
}

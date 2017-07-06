package DI01_2;

/*
 * 스프링없이 DI - 생성자 주입
 *  - 운전자가 타이어 브랜드 선택
 *  - 운전자가 자동차를 주문했을 때, 선택한 타이어가 장착
 */

public class DriverMain {

	public static void main(String[] args) {
		
		// Tire tire = new KoreaTire();
		Tire tire = new AmericaTire();
		
		// ������ DI �߻�
		Car car = new Car(tire);
		System.out.println(car.getTireBrand());

	}

}

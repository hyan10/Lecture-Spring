package DI01_3;

/*
 * 스프링없이 DI - 속성 주입방식(Setter Injection)
 *  - 운전자가 타이어 주문
 *  - 운전자가 자동차 주문
 *  - 운전자가 직접 자동차에 타이어 장착
 */


public class DriverMain {

	public static void main(String[] args) {
		
		// Tire tire = new KoreaTire();
		Tire tire = new AmericaTire();
		
		// �Ӽ� DI �߻�
		Car car = new Car();
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());

	}

}

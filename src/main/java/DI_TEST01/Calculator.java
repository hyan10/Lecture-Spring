package DI_TEST01;

public class Calculator {
	
	void addition(int firstNum, int secondNum){
		System.out.println("µ¡¼À°á°ú: "+(firstNum+secondNum));
	}
	
	void sub(int firstNum, int secondNum){
		System.out.println("»¬¼À°á°ú: "+(firstNum-secondNum));
	}
	
	void multiply(int firstNum, int secondNum){
		System.out.println("°ö¼À°á°ú: "+(firstNum*secondNum));
	}
	
	void divide(int firstNum, int secondNum){
		System.out.println("°ö¼À°á°ú: "+(firstNum/secondNum));
	}
}

package DI_TEST01;

public class MyCalculator {
	private int firstNum;
	private int secondNum;
	private Calculator cal;
	

	public MyCalculator() {
		super();
	}
	
	

	public MyCalculator(Calculator cal) {
		super();
		this.cal = cal;
	}



	public MyCalculator(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}



	public MyCalculator(int firstNum, int secondNum, Calculator cal) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.cal = cal;
	}

	public void add(){
		cal.addition(firstNum, secondNum);
	}
	
	public void sub(){
		cal.sub(firstNum, secondNum);
	}
	
	public void mul(){
		cal.multiply(firstNum, secondNum);
	}
	
	public void div(){
		cal.divide(firstNum, secondNum);
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void setCal(Calculator cal) {
		this.cal = cal;
	}
	
	
}

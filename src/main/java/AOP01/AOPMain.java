package AOP01;

public class AOPMain {

	public static void main(String[] args) {
		Boy boy = new Boy();
		Girl girl = new Girl();
		
		boy.runSomething();
		girl.runSomething();
	}
}

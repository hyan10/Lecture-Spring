package basic;

public class Hello {
	private String msg;

	public Hello() {
		System.out.println("로딩 완료");
		msg = "hello";
	}

	public void printMsg() {
		System.out.println("msg: " + msg);
	}

}

package AOP01;

public class MyAspect {
	
	public static void beforeRunSomething() {
		System.out.println("열쇠로 문을 열고 집으로 들어온다.");
	}
	
	public static void afterRunSomething() {
		System.out.println("불을 끄고 잠을 잔다.");
		System.out.println("문을 잠그고 밖으로 나간다.");
	}

	public static void throwRunSomething() {
		System.out.println("비상사태");
		System.out.println("비상사태");
	}
	
}

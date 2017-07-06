package AOP01;

public class Girl {

	public void runSomething() {
		
		MyAspect.beforeRunSomething();

		System.out.println("화장을 지운다.");
		
		MyAspect.afterRunSomething();
		
		/*System.out.println("열쇠로 문을 열고 집으로 들어온다.");
		System.out.println("화장을 지운다.");
		System.out.println("불을끄고 잠을 잔다.");
		System.out.println("문을 잠그고 밖으로 나간다.");*/
	}

}

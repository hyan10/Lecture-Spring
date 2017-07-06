package AOP01;

public class Boy {

	public void runSomething() {

		try {
			MyAspect.beforeRunSomething();

			System.out.println("컴퓨터 게임을 한다.");

			throw new Exception("어머니 등장");
			
			//MyAspect.afterRunSomething();
			
		} catch (Exception e) {
			MyAspect.throwRunSomething();
		}		

		/*System.out.println("열쇠로 문을 열고 집으로 들어온다.");
		System.out.println("컴퓨터 게임을 한다.");
		System.out.println("불을 끄고 잠을 잔다.");
		System.out.println("문을 잠그고 밖으로 나간다.");*/
	}
}

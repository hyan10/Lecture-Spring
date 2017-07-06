package AOP02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution( void AOP02.Boy.runSomething()) ")
	public void before(JoinPoint joinPoint) {
		System.out.println("열쇠로 문을 열고 집으로 들어간다.");
	}
	
}

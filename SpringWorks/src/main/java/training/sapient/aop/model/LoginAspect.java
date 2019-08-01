package training.sapient.aop.model;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoginAspect {

//	@Before(value = "execution(public training.sapient.aop.model.* get*())")
	@Around(value = "execution(public training.sapient.aop.model.* get*())")
	public void loggingBeforeAdvice() {
		System.out.println("Before advice is called...");

	}

}

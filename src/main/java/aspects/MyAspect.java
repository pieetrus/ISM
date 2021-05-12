package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	/**
	 * Will log every execution of Student's methods
	 */
	@Around("execution(* io.swagger.model.Game.*(..))")
	public Object doThing(final ProceedingJoinPoint thisJoinPoint) throws Throwable {
		final String joinPointName = thisJoinPoint.getThis().getClass().getSimpleName() + "." + thisJoinPoint.getSignature().getName() + "()";
		System.out.println("Entering [" + joinPointName + "]");
		Object retVal = thisJoinPoint.proceed();
		System.out.println("Leaving  [" + joinPointName + "]");
		return retVal;
	}
}

package aspects;


import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import io.swagger.model.GameStats;


@Aspect
@Component
public class MyAspect {
	
	static GameStats gameData = new GameStats();

	 static public  GameStats GameStats() {
			return gameData;
		}
	
	/**
	 * Will log every execution of Student's methods
	 */
	@Around("execution(* io.swagger.model.Game.*(..))")
	public Object doThing(final ProceedingJoinPoint thisJoinPoint) throws Throwable {
		
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .currentRequestAttributes())
                .getRequest();
		
		if(thisJoinPoint.getTarget().getClass().getName().equals("io.swagger.model.Game"))
    	{        	
        	if(request.getMethod().equals("GET"))
        	{
        		gameData.setGET();
        	}
        	if(request.getMethod().equals("POST"))
        	{
        		gameData.setPOST();
        	}
        	if(request.getMethod().equals("DELETE"))
        	{
        		gameData.setDELETE();
        	}
    	}
			
		Object retVal = thisJoinPoint.proceed();
		
		return retVal;
	}
}

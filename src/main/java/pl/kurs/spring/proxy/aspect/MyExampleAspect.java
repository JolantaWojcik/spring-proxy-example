package pl.kurs.spring.proxy.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class MyExampleAspect {

	@Before("execution(* pl.kurs.spring.proxy.service.impl.*.*(..))")
	public void logMethod(JoinPoint joinPoint){
		System.out.println("Metoda: "+joinPoint.getSignature().getName());
	}
	
}

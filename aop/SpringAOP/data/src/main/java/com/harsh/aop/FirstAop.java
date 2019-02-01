package com.harsh.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FirstAop {

	@Before(value ="show() && args(id) ")
	public int showMsg(int id) {//advice method
		System.out.println("Before AOP "+id);
		return 560;
	}
	
	@After(value ="show() && "
			+ "args(id)")
	public void showMsg1(JoinPoint jp,int id) {
		System.out.println("AFTER AOP 1     "+id + " jp -> " + jp.getSignature());

		id = 45;
		System.out.println("AFTER AOP 2   "+id + " jp -> " + jp.getSignature());
	}
	
	@After("args(id)")
	public void showMsg3(int id) {
		System.out.println("AFTER AOP 1 "+id );

		id = 90;
		System.out.println("AFTER AOP  2 "+id );
	}
	
	
	
	@AfterReturning(value="show()" ,   
            returning= "id")
	public void showMsg2(int id) {
		id++;
		System.out.println("AFTERReturing AOP  "+id);
	}
	
	@Around(value="show() && args(id)")
	public Object showAround(ProceedingJoinPoint joinPoint , int id) throws Throwable {
		System.out.println("AROUND BEFORE  "+id);
		id = 9090;
		System.out.println(" joinPoint.getKind() " + joinPoint.getKind());
		System.out.println(" joinPoint.getArgs() " + joinPoint.getArgs());
		System.out.println(" joinPoint.getStaticPart() " + joinPoint.getStaticPart());
		System.out.println(" joinPoint.getTarget() " + joinPoint.getTarget());
		System.out.println(" joinPoint.getThis() " + joinPoint.getThis());

		Object object = joinPoint.proceed();
		System.out.println("AROUND AFTER "+object);
		return 9998;
	}
	
	@Pointcut("execution(public * *(..) )")//pointcut
	public void show() {
		System.out.println("yeh nahi chalta");
	}
}

package sandip12.Aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* sandip12.Aop.services.PaymentServiceImpl.makePayment(..))")
       public void printBerfore() {
	System.out.println("Payment Started..");
}
	
	@After("execution(* sandip12.Aop.services.PaymentServiceImpl.makePayment(..))")
    public void printAfter() {
	System.out.println("Payment Ended..");
}
	
}

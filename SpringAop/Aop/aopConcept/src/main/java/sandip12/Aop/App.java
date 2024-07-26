package sandip12.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sandip12.Aop.services.PaymentService;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext con = new ClassPathXmlApplicationContext("sandip12/Aop/service.xml");
       
//       System.out.println(con.getBean("myAspect"));
       PaymentService  temp  = (PaymentService) con.getBean("Payment");
       temp.makePayment(2125);
       
      
    }
}

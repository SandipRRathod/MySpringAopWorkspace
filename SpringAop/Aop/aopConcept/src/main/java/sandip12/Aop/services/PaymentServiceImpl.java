package sandip12.Aop.services;



public class PaymentServiceImpl implements PaymentService{

	
	@Override
	public void makePayment(int X) {
		// TODO Auto-generated method stub
		// payment code 
		
		System.out.println(X +" Ammount is debited..");
		
		
		
		System.out.println(X +" Ammount is credited..");

	}



}

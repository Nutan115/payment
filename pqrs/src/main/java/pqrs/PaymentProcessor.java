package pqrs;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentProcessor  {
    
    private Creditcard creditcard;
    private Debitcard debitcard; 

   




	public void setCreditcard(Creditcard creditcard) {
		this.creditcard = creditcard;
	}




	public void setDebitcard(Debitcard debitcard) {
		this.debitcard = debitcard;
	}



	public void process() {
        System.out.println("Processing payment...");
        creditcard.pay();
        System.out.println("Payment processed successfully.");
    }
}

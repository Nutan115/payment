package pqrs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Springconnfig.xml");

        PaymentProcessor processor =(PaymentProcessor) context.getBean("paymentProcessor");
        processor.process();
    }
}

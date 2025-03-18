package pqrs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springg  {
	public static void main(String[]arg) {
		 ApplicationContext app= new ClassPathXmlApplicationContext("springcon.xml");
		 Debit dc=(Debit)app.getBean("abcd");
		 dc.pay();
	}

}

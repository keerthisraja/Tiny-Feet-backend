package com.niit.ecartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecartbackend.dao.CreditCardDAO;
import com.niit.ecartbackend.model.CreditCard;

public class CreditCardTest {
	
	public static void main (String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecartbackend");
        context.refresh();
        
        CreditCardDAO creditcardDAO = (CreditCardDAO) context.getBean("CreditCardDAO");
        CreditCard creditcard = (CreditCard) context.getBean("creditcard");
        
        creditcard.setS_No(12345);
        creditcard.setNameOnCard("tinyfeet");
        creditcard.setCardNumber(1236899);
        creditcard.setMonth(6);
        creditcard.setYears(2017);
        creditcard.setCvv(1284683);
        creditcardDAO.saveOrUpdate(creditcard);
	}
}
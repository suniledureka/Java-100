package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.Customer;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customer-car-beans.xml");
		
		Customer customer = (Customer)context.getBean("sajith");
		
		System.out.println(customer.getCustomerName()+ " owns a " + customer.getCar().getModel()+" car, which costs Rs." + customer.getCar().getCost());
	}
}

package Main;

import java.time.LocalDate;

import Abstracts.BaseCustomerManager;
import Concretes.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		BaseCustomerManager customerManager = new NeroCustomerManager();
	    Customer customer = new Customer(1, "Mert", "Balkan", date, "342432");
		
		customerManager.save(customer);
		
	}
}
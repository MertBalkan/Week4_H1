package Concretes;

import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}
}
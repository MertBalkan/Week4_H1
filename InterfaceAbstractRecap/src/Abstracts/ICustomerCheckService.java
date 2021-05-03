package Abstracts;

import Entities.Customer;

public interface ICustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
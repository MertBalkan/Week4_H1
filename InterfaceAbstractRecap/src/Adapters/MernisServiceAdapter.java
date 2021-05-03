package Adapters;

import java.rmi.RemoteException;

import Abstracts.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{
	
	private boolean result;
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		this.result = false;
		try {
			this.result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return this.result;
	}
}
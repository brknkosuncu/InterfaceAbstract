import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.*;
import Entities.Customer;

public class Main {
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Berkan", "KOÞUNCU", LocalDate.of(1997, 2, 12), "12345678912");
		Customer customer2 =new Customer("Ali", "VELÝ", LocalDate.of(2008, 8, 25), "12312312312");
		
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(customer2);
		
		
	}
}

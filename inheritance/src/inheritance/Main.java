package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		
		IndividualCustomer oguz = new IndividualCustomer();
		oguz.customerNumber = "12345";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber= "1254";
		
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "12778";
		
		CustomerManager customerManager = new CustomerManager();
		
		//customerManager.add(hepsiBurada);
		//customerManager.add(oguz);
		
		Customer[] customers = {oguz, abc, hepsiBurada};
		
		customerManager.addMultiple(customers);
		
		
	}

}

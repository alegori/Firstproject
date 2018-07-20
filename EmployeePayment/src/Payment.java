
public class Payment {

	public static void main(String[] args) {
		
		// create a person object
		
		Person person = new Person ();
		
		person.setFirstName("Chimu");
		
		person.setLastName("Bonilla");
		
		person.setHourlyRate(40);		
		
			//print the state of the person object
		
	System.out.println(person.toString());
	
	//get 	and print the month payment
	
	System.out.println(person.getPayment(300));

	// create a person2 object
	
	Person person2 = new Person();
	
	person.setFirstName("David");
	
	person.setLastName("Guitierrez");
	
	person.setHourlyRate(60);
	
	System.out.println(person.toString());
	
	System.out.println(person.getPayment(500)); 
	
	
	}
	 
	
	
}

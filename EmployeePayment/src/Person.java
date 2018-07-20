
public class Person {
	
	private String firstName; 
	
	private String lastName;
	
    private double hourlyRate;

	public Person() {
		super();
	
		this.firstName = "Luis";
				
		this.lastName = "Sierra";
		
		this.hourlyRate = 500;
		
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", hourlyRate=" + hourlyRate + "]";
	}

	public Person(String firstName, String lastName, double hourlyRate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
    
    public double getPayment(int hours){
		
    	return this.hourlyRate*hours;
    	
    }

}

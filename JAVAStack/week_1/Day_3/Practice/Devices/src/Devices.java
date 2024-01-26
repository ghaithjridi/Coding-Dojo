
public class Devices {
	
	// Member variables
	
	private int battery = 100;
	
	

	// Constructor
	
	public Devices(int battery) {
		
		this.battery = battery;
	}
	
	// {Methods
	
	public void displayStats(){
		System.out.println( "remaining battery is :"+ this.getBattery());
		
	}
	
	
	
	
	
	
	
	
	
	

	
	//Getters and setters
	

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	
	
	
}

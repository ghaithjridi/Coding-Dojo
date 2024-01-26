
public class Phone extends Devices  {
	
	
	

	public Phone(int battery) {
		super(battery);
		
	}
	
	
	public void makeCall(){
		  System.out.println("You make a call.");
	        setBattery(getBattery() - 5);
	        displayStats();
       
    }
	
	public void playGame(){
        System.out.println("You play a game.");
        setBattery(getBattery() - 20);
        displayStats();
    }
	
	 public void charge(){
	        System.out.println("You charge your phone.");
	        setBattery(getBattery() + 50);
	        displayStats();
	    }
	
	

}
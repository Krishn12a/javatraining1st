package cardetails;

public class truck extends vehicle {
	private String steering;
	
	public truck() {
		super();
		this.steering="Power steering";
				
	}
	public truck(String engine,int wheels,int seats,int fueltank,String lights,boolean abs,String steering) {
		super(engine,wheels,seats,fueltank,lights,abs);
		this.steering=steering;
	}
	public String getSteering() {
		return steering;
	}
	public void getVehicleDetails() {
		
	}

}

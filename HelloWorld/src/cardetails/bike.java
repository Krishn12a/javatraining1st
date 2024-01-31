package cardetails;

public class bike extends vehicle{
	private String handle;
	
	public bike() {
		super();
		this.handle="short";
	}
	public bike(String handle) {
		this.handle=handle;
	}
	
	public String getHandle() {
		return handle;
	}
	
	public void getVehicleDetails() {
		super.getVehicleDetails();
		System.out.println("handle : "+getHandle());
	}

}

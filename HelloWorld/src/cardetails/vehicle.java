package cardetails;

public class vehicle {
 private String engine;
 private int wheels;
 private int seats;
 private int fueltank;
 private String lights;
 private boolean abs;

 
 public vehicle() {
	 engine="Petrol";
	 wheels=4;
	 seats=6;
	 fueltank=2;
	 lights="LED";
	 abs=true;
 }
 public vehicle(String engine,int wheels,int seats,int fueltank,String lights,boolean abs) {
	this.engine=engine;
	this.wheels=wheels;
	this.seats=seats;
	this.fueltank=fueltank;
	this.lights=lights;
	this.abs=abs;
 }
 
	public String getEngine() {
		return engine;
	}
	public int getWheels() {
		return wheels;
	}
	public int getSeats() {
		return seats;
	}
	public int getFueltank() {
		return fueltank;
	}
	public String getLights() {
		return lights;
	}
	public boolean getAbs() {
		return abs;
	}

	public void getVehicleDetails(){
		System.out.println("Engine :" + getEngine());
		System.out.println("Wheels : "+getWheels());
		System.out.println("fueltank : "+getFueltank());
		System.out.println("lights : "+getLights());
		System.out.println("abs : "+getAbs());
		
	}
 
 
}

package cardetails;

public class carc {
	String doors;
	String engine;
	String driver;
	int speed;
	
	public carc(){
		doors="closed";
		engine="on";
		driver="seated";
		speed=50;
	}
	public carc(String doors,String engine,String driver,int speed) {
		
	}
	
	public String run() {
		if(doors.equals("closed")&&(engine.equals("on")&&(driver.equals("seated")&& speed>0))) {
			return "car is running";
		}
		else {
			return "car is not running";
		}
	}
	
}



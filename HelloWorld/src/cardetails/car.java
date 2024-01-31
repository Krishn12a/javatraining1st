package cardetails;

public class car {
	private String carName;
	
	public void setCarname(String carName) {
		this.carName=carName;
	}
	public String getCarname() {
		return carName;
	}
	public String EngineType(String car) {
		class Engine{
			public String EngineType(String car) {
				String type;
				if(car.equals("Bmw")) {
					type="4wd";
				}
				else if(car.equals("Toyota")){
					type="d4d";
				}
				else {
					type="no type";
				}
				
				return type;
				
			}
				
		}
		
		
		return new Engine().EngineType(car);
		
		
	}

}

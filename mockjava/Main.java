package mockjava;
import java.util.Date;
enum Vehicles{
	TRUCK,
	CAR,
	BIKE;
	String parkingId;
	String vehiclename;
	Date enteringTime;
	Date leavingTime;
	Vehicles(){
		
	}
	Vehicles(String parkingId,String vehiclename,Date enteringTime,Date leavingTime){
		this.parkingId=parkingId;
		this.vehiclename=vehiclename;
		this.enteringTime=enteringTime;
		this.leavingTime=leavingTime;
	}
}
public class Main {
		 
	void parkingSystem() {
		int n=5;
		Vehicles vehicle=Vehicles.BIKE;
		switch(vehicle) {
		case BIKE:
			
		case TRUCK:
			
		case CAR:
			
		default:
			
			
		}
	}
	
}

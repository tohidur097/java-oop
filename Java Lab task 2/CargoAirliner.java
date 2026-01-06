public class CargoAirliner extends AirTransporter{
	private int maxCargoWeight;
	
	public CargoAirliner(){
	}
	
	public CargoAirliner(String manufacturer,double maxAltitude,double maxSpeed,int maxCargoWeight){
		super(manufacturer,maxAltitude,maxSpeed);
		this.maxCargoWeight=maxCargoWeight;
	}
	public void setMaxCargoWeight(int maxCargoWeight){
		this.maxCargoWeight=maxCargoWeight;
	}
	public int getMaxCargoWeight(){
		return maxCargoWeight;
	}
	public void showDetails(){
		System.out.println("Air Transporter Details");
		System.out.println("Manufacturer : "+getManufacturer());
		System.out.println("Maximum Altitude : "+getMaxAltitude()+" "+"ft");
		System.out.println("Maximum Speed : "+getMaxSpeed()+" "+"KM/Hr");
		System.out.println("passenger Capacity : "+maxCargoWeight+" "+"KG");
	}
		
}
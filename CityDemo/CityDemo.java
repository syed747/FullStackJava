package CityDemo;

public class CityDemo {
	public static void main(String[] args) {
		System.out.println("syeds government....");
		
		Roads singaporeRoads=new Roads();
		AirPort adaniAirport=new AirPort();
		RailwayStation japaneseBullenTrain=new RailwayStation();
		BusStand dubaiBusStand=new BusStand();
		Water gangaWater=new Water();
		Drainage londonDrainage=new Drainage();
		
		GoodCityHome.buildInfra(singaporeRoads, dubaiBusStand, japaneseBullenTrain,
				adaniAirport, gangaWater, londonDrainage);
		
		BuyPlot syedPlot=new BuyPlot();
		GovtApproval sydApproval=new GovtApproval();
		
		
		BuyPlot hussainPlot=new BuyPlot();
		GovtApproval husApproval=new GovtApproval();
		
		GoodCityHome istHome=new GoodCityHome(syedPlot, sydApproval);
		istHome.buildHome();
		
		GoodCityHome sarHome=new GoodCityHome(hussainPlot, husApproval);
		sarHome.buildHome();
		
	}
}
class BadCity{
	public void buildMonument() {
		//this job was going on for 5 years.....
		while(true) {}
	}
}
class GoodCityHome{
	static Roads roads;
	static BusStand busStand;
	static RailwayStation railwayStation;
	static AirPort airport;
	static Water water;
	static Drainage drainage;
	
	BuyPlot bp;
	GovtApproval approval;
	public static void buildInfra(Roads roads,BusStand busStand,RailwayStation railwayStation,
			AirPort airport,Water water,Drainage drainage
			) {
		GoodCityHome.roads=roads;
		GoodCityHome.busStand=busStand;
		GoodCityHome.railwayStation=railwayStation;
		GoodCityHome.airport=airport;
		GoodCityHome.water=water;
		GoodCityHome.drainage=drainage;
		
	}
	public GoodCityHome(BuyPlot bp,GovtApproval approval) {
		this.bp=bp;this.approval=approval;
	}
	
	public void buildHome() {
		System.out.println("I am using....:"+GoodCityHome.roads);
		System.out.println("I am using....:"+GoodCityHome.busStand);
		System.out.println("I am using....:"+GoodCityHome.railwayStation);
		System.out.println("I am using....:"+GoodCityHome.airport);
		System.out.println("I am using....:"+GoodCityHome.water);
		System.out.println("I am using....:"+GoodCityHome.drainage);
		
		System.out.println("I got approval to build home...:"+this.approval);
		System.out.println("I purchase plot to build home...:"+this.bp);
		
		System.out.println("I am building home.........:):::::::::");
	}
}
class Roads{}
class BusStand{}
class RailwayStation{}
class AirPort{}
class Water{}
class Drainage{}
class BuyPlot{}
class GovtApproval{}

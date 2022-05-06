package ianculescu.alexandra.g1098.factorymethod;


public class CityBreakTourismPackage extends AbstractTourismPackage {

	public CityBreakTourismPackage(String destination, int noOfNights, int noOfFlightTickets, MealPlan mealPlan) {
		this.destination = destination;
		this.noOfNights = noOfNights;
		this.noOfFlightTickets = noOfFlightTickets;
		this.mealPlan = mealPlan;
	}

	@Override
	public TourismType getType() {
		return TourismType.CITY_BREAK;
	}

}

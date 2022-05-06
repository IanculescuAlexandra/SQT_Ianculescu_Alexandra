package ianculescu.alexandra.g1098.decorator;

    public class TourismPackage extends AbstractTourismPackage{

	String destination;
	int noOfNights;
	int noOfFlightTickets;
	MealPlan mealPlan;

	public TourismPackage() {

	}

	public TourismPackage(String destination, int noOfNights, int noOfFlightTickets, MealPlan mealPlan) {
		this.destination = destination;
		this.noOfNights = noOfNights;
		this.noOfFlightTickets = noOfFlightTickets;
		this.mealPlan = mealPlan;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNoOfNights() {
		return noOfNights;
	}

	public void setNoOfNights(int noOfNights) {
		this.noOfNights = noOfNights;
	}

	public int getNoOfFlightTickets() {
		return noOfFlightTickets;
	}

	public void setNoOfFlightTickets(int noOfFlightTickets) {
		this.noOfFlightTickets = noOfFlightTickets;
	}

	public MealPlan getMealPlan() {
		return mealPlan;
	}

	public void setMealPlan(MealPlan mealPlan) {
		this.mealPlan = mealPlan;
	}

	@Override
	public void showFacilities() {
		
	}

}

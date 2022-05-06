package ianculescu.alexandra.g1098.simplefactory;

public abstract class AbstractTourismPackage {

	String destination;
	int noOfNights;
	int noOfFlightTickets;
	MealPlan mealPlan;

	public abstract TourismType getType();

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setNoOfNights(int noOfNights) {
		this.noOfNights = noOfNights;
	}

	public void setNoOfFlightTickets(int noOfFlightTickets) {
		this.noOfFlightTickets = noOfFlightTickets;
	}

	public void setMealPlan(MealPlan mealPlan) {
		this.mealPlan = mealPlan;
	}

	public String getDestination() {
		return destination;
	}

	public int getNoOfNights() {
		return noOfNights;
	}

	public int getNoOfFlightTickets() {
		return noOfFlightTickets;
	}

	public MealPlan getMealPlan() {
		return mealPlan;
	}

	
}

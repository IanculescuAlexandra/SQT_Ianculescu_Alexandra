package ianculescu.alexandra.g1098.composite;

public class TourismPackage extends HierarchyNode {

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

	@Override
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public int getNoOfNights() {
		return noOfNights;
	}

	public void setNoOfNights(int noOfNights) {
		this.noOfNights = noOfNights;
	}

	@Override
	public int getNoOfFlightTickets() {
		return noOfFlightTickets;
	}

	public void setNoOfFlightTickets(int noOfFlightTickets) {
		this.noOfFlightTickets = noOfFlightTickets;
	}

	@Override
	public String getMealPlan() {
		return mealPlan.toString();
	}

	public void setMealPlan(MealPlan mealPlan) {
		this.mealPlan = mealPlan;
	}

}

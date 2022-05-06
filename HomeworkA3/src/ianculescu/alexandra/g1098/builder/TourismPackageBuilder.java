package ianculescu.alexandra.g1098.builder;

public class TourismPackageBuilder {

	private TourismPackage tourismPackage = null;

	public TourismPackageBuilder(String destination, int noOfNights) {
		this.tourismPackage = new TourismPackage();
		this.tourismPackage.setDestination(destination);
		this.tourismPackage.setNoOfNights(noOfNights);
	}

	public TourismPackageBuilder addNoOfFlightTickets(int noOfFlightTickets) {
		this.tourismPackage.setNoOfFlightTickets(noOfFlightTickets);
		return this;
	}

	public TourismPackageBuilder addMealPlan(MealPlan mealPlan) {
		this.tourismPackage.setMealPlan(mealPlan);
		return this;
	}

	public TourismPackage build() {
		return this.tourismPackage;
	}
}

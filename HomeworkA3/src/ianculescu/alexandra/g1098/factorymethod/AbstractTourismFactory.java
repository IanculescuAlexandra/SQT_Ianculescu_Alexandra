package ianculescu.alexandra.g1098.factorymethod;


public abstract class AbstractTourismFactory {

	public abstract AbstractTourismPackage getTourismType(TourismType tourismType,String destination, int noOfNights, int noOfFlightTickets, MealPlan mealPlan);
}

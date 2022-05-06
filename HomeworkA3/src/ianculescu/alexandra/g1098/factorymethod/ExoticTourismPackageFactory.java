package ianculescu.alexandra.g1098.factorymethod;

public class ExoticTourismPackageFactory extends AbstractTourismFactory{

	@Override
	public AbstractTourismPackage getTourismType(TourismType tourismType, String destination, int noOfNights,
			int noOfFlightTickets, MealPlan mealPlan) {
		switch(tourismType) {
		case EXOTIC:
			return new ExoticTourismPackage(destination, noOfNights, noOfFlightTickets, mealPlan);
		default:
			throw new UnsupportedOperationException();
		}
	}

}

package ianculescu.alexandra.g1098.factorymethod;


public class TourismPackageFactory extends AbstractTourismFactory {

	@Override
	public AbstractTourismPackage getTourismType(TourismType tourismType, String destination, int noOfNights,
			int noOfFlightTickets, MealPlan mealPlan) {
		switch(tourismType) {
		case CITY_BREAK:
			return new CityBreakTourismPackage(destination, noOfNights, noOfFlightTickets, mealPlan);
		case EXOTIC:
			return new ExoticTourismPackage(destination, noOfNights, noOfFlightTickets, mealPlan);
		default:
			throw new UnsupportedOperationException();
		}
	}

}

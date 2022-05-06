package ianculescu.alexandra.g1098.builder;

public class TestBuilder {

	public void test() {

		TourismPackageBuilder tourismPackageBuilder = new TourismPackageBuilder("Cluj", 7);
		TourismPackage tourismPackage = tourismPackageBuilder.addNoOfFlightTickets(2)
				.addMealPlan(MealPlan.ALL_INCLUSIVE).build();

		System.out.println(tourismPackage.getMealPlan());

	}

}

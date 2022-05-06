package ianculescu.alexandra.g1098.prototype;

public class TestPrototype {

	public void test() {
		TourismPackage tourismPackage = new TourismPackage("Cluj", 7, 2, MealPlan.ALL_INCLUSIVE);
		System.out.println(tourismPackage.getDestination());

		TourismPackage tourismPackage2 = (TourismPackage) tourismPackage.clone();
		System.out.println(tourismPackage2.getDestination());
	}


}

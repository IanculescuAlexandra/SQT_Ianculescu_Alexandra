package ianculescu.alexandra.g1098.simplefactory;

public class TestSimpleFactory {

	public void test() {
		
	    AbstractTourismPackage exoticPackage=TourismPackageSimpleFactory.getTourismType(TourismType.EXOTIC,"Cluj", 7, 2, MealPlan.ALL_INCLUSIVE);
	    
	    System.out.println(exoticPackage.getType());
	}
}

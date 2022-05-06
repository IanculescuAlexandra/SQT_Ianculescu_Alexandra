package ianculescu.alexandra.g1098.factorymethod;

public class TestFactoryMethod {
	public void test() {
		TourismPackageFactory tourismPackageFactory=new TourismPackageFactory();
		AbstractTourismPackage exoticPackage=tourismPackageFactory.getTourismType(TourismType.EXOTIC,"Mamaia", 7, 2,MealPlan.ALL_INCLUSIVE);
	    
		System.out.println(exoticPackage.getType() + " " + exoticPackage.getDestination());
	}
	
}

package ianculescu.alexandra.g1098.decorator;

public class TestDecorator {
	public void test() {
		AbstractTourismPackage tourismPackage = new TourismPackage();
		
		tourismPackage=new ImprovedTourismPackageDecorator(tourismPackage, true);
		
		tourismPackage.showFacilities();
	}
	
	
}

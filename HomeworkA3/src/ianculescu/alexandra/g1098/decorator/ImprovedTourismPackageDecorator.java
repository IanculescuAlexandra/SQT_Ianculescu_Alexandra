package ianculescu.alexandra.g1098.decorator;

public class ImprovedTourismPackageDecorator extends AbstractTourismPackageDecorator{

	boolean isTransportationIncluded;
	public ImprovedTourismPackageDecorator(AbstractTourismPackage abstractTourismPackage, boolean isTransportationIncluded) {
		super(abstractTourismPackage);
		this.isTransportationIncluded=isTransportationIncluded;
	}
	
	@Override
	public void showFacilities() {
		this.abstractTourismPackage.showFacilities();
		System.out.println("Transport included? " + isTransportationIncluded);
	}

	
}

package ianculescu.alexandra.g1098.decorator;

public class AbstractTourismPackageDecorator extends AbstractTourismPackage{

	AbstractTourismPackage abstractTourismPackage;
	
	public AbstractTourismPackageDecorator(AbstractTourismPackage abstractTourismPackage) {
		super();
		this.abstractTourismPackage=abstractTourismPackage;
	}
	
	@Override
	public void showFacilities() {
		this.abstractTourismPackage.showFacilities();
	}

}

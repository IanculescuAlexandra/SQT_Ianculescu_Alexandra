package ianculescu.alexandra.g1098.composite;


public class TestComposite {
	public void test() {
		
	    HierarchyNode node1 = new TourismPackage("Cluj", 7, 2, MealPlan.ALL_INCLUSIVE);
	    
	    HierarchyNode node2 = new TourismPackage("Arad", 10, 2, MealPlan.FULL_BOARD);
	    
	    HierarchyNode node3 = new TourismPackage("Mamaia", 20, 2, MealPlan.BREAKFAST_ONLY);
	    
	    InternalStructure structure = new InternalStructure();
	    
	    structure.addChildNode(node1);
	    structure.addChildNode(node2);
	    structure.addChildNode(node3);

		TourismCatalog catalog = new TourismCatalog(structure);
		
		System.out.println("All destinations: " + catalog.structure.getDestination());
		System.out.println("All meal plans: " + catalog.structure.getMealPlan());

		System.out.println("Total nights: " + catalog.structure.getNoOfNights());
		System.out.println("Total tickets: " + catalog.structure.getNoOfFlightTickets());

	}
}

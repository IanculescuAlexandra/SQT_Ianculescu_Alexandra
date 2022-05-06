package ianculescu.alexandra.g1098.composite;

public abstract class HierarchyNode {
	
	public abstract String getDestination();
	public abstract int getNoOfNights();
	public abstract int getNoOfFlightTickets();
	public abstract String getMealPlan();
	
	public void addChildNode(HierarchyNode node) {
		throw new UnsupportedOperationException();
	}
	
	public void deleteChildNode(HierarchyNode node) {
		throw new UnsupportedOperationException();
	}
	
	public HierarchyNode getChildNode(int i) {
		throw new UnsupportedOperationException();
	}

}

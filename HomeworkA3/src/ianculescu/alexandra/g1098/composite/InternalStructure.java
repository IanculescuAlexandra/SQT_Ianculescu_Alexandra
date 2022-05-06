package ianculescu.alexandra.g1098.composite;

import java.util.ArrayList;

public class InternalStructure extends HierarchyNode {

	ArrayList<HierarchyNode> elements = new ArrayList();
	
	public InternalStructure() {
		
	}
	
	@Override
	public String getDestination() {
		StringBuilder sb = new StringBuilder();
		for (HierarchyNode elem : elements) {
			sb.append(elem.getDestination()).append(" ");
		}
		return sb.toString();
	}

	@Override
	public int getNoOfNights() {
		int totalNights = 0;
		for (HierarchyNode elem : elements) {
			totalNights += elem.getNoOfNights();
		}
		return totalNights;
	}

	@Override
	public int getNoOfFlightTickets() {
		int totalTickets = 0;
		for (HierarchyNode elem : elements) {
			totalTickets += elem.getNoOfFlightTickets();
		}
		return totalTickets;
	}

	@Override
	public String getMealPlan() {
		StringBuilder sb = new StringBuilder();
		for (HierarchyNode elem : elements) {
			sb.append(elem.getMealPlan().toString()).append(" ");
		}
		return sb.toString();
	}
	
	@Override
	public void addChildNode(HierarchyNode node) {
		this.elements.add(node);
	}

	@Override
	public void deleteChildNode(HierarchyNode node) {
		this.elements.remove(node);
	}

	@Override
	public HierarchyNode getChildNode(int i) {
		return (HierarchyNode) elements.get(i);
	}

	

}

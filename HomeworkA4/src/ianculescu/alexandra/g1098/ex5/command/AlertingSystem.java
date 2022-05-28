package ianculescu.alexandra.g1098.ex5.command;

import java.util.ArrayList;

public class AlertingSystem {

	public ArrayList<SystemOrder> systemOrders;
	int orderNumber;
	
	public AlertingSystem(int orderNumber) {
		this.orderNumber = orderNumber;
	    systemOrders=new ArrayList<>();
	}
	
	public void takeOrder(SystemOrder order) {
		this.systemOrders.add(order);
	}
	
	public void sendOrder() {
		for(SystemOrder order:systemOrders)
			order.action();
		this.systemOrders.clear();
	}
	
}

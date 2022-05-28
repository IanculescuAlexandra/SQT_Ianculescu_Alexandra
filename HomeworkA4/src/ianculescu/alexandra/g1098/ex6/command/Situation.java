package ianculescu.alexandra.g1098.ex6.command;

import java.util.ArrayList;

public class Situation {

	public ArrayList<SituationOrder> situationOrders;
	int noSituation;
	
	public Situation(int noSituation) {
		this.noSituation=noSituation;
		situationOrders=new ArrayList<>();
	}
	
	public void takeOrder(SituationOrder situation){
		this.situationOrders.add(situation);
	}
	
	public void sendOrder(){
		for(SituationOrder order : situationOrders)
			order.follow();
		this.situationOrders.clear();
	}
}

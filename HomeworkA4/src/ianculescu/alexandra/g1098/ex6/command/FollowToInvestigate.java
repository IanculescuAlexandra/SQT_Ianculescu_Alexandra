package ianculescu.alexandra.g1098.ex6.command;

public class FollowToInvestigate implements SituationOrder {

	private MonitoringDrone monitoringDrone;
	@Override
	public void follow() {
		monitoringDrone.followToInvestigate();
	}
	public FollowToInvestigate(MonitoringDrone monitoringDrone) {
		super();
		this.monitoringDrone = monitoringDrone;
	}
	

}

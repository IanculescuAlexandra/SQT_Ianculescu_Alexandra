package ianculescu.alexandra.g1098.ex6.command;

public class FollowGridBasedPath implements SituationOrder {

	private MonitoringDrone monitoringDrone;
	@Override
	public void follow() {
		monitoringDrone.followGridBasedPath();
	}
	public FollowGridBasedPath(MonitoringDrone monitoringDrone) {
		super();
		this.monitoringDrone = monitoringDrone;
	}
	

}

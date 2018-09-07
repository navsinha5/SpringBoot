package assistantiot.fulfillment.pojo;

public class SyncPayload {
	
	private String agentUserId;
	private Devices devices;
	
	public String getAgentUserId() {
		return agentUserId;
	}
	public void setAgentUserId(String agentUserId) {
		this.agentUserId = agentUserId;
	}
	public Devices getDevices() {
		return devices;
	}
	public void setDevices(Devices devices) {
		this.devices = devices;
	}

}

package assistantiot.fulfillment.pojo;

public class SyncResponse {
	
	private String requestId;
	private SyncPayload payload;
	
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public SyncPayload getPayload() {
		return payload;
	}
	public void setPayload(SyncPayload payload) {
		this.payload = payload;
	}

}

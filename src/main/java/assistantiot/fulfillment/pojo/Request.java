package assistantiot.fulfillment.pojo;

import java.util.List;

public class Request {
	
	private String requestId;
	private List<Inputs> inputs;
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public List<Inputs> getInputs() {
		return inputs;
	}
	public void setInputs(List<Inputs> inputs) {
		this.inputs = inputs;
	}

}

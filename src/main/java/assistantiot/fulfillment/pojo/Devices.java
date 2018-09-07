package assistantiot.fulfillment.pojo;

import java.util.List;

public class Devices {
	
	private String id;
	private String type;
	private List<String> traits;
	private Name name;
	private boolean willReportState;
	
	public boolean isWillReportState() {
		return willReportState;
	}
	public void setWillReportState(boolean willReportState) {
		this.willReportState = willReportState;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getTraits() {
		return traits;
	}
	public void setTraits(List<String> traits) {
		this.traits = traits;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}

}

package assistantiot.fulfillment.pojo;

import java.util.List;

public class Name {
	
	private List<String> defaultNames;
	private String name;
	private List<String> nicknames;
	
	public List<String> getDefaultNames() {
		return defaultNames;
	}
	public void setDefaultNames(List<String> defaultNames) {
		this.defaultNames = defaultNames;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getNicknames() {
		return nicknames;
	}
	public void setNicknames(List<String> nicknames) {
		this.nicknames = nicknames;
	}

}

package assistantiot.fulfillment.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import assistantiot.fulfillment.pojo.Devices;
import assistantiot.fulfillment.pojo.Name;
import assistantiot.fulfillment.pojo.Request;
import assistantiot.fulfillment.pojo.SyncPayload;
import assistantiot.fulfillment.pojo.SyncResponse;
import assistantiot.fulfillment.services.FulfillmentService;

@Service
public class FulfillmentServiceImpl implements FulfillmentService {
	
	@Override
	public SyncResponse getFulfillment(Request request) {
		SyncResponse response = new SyncResponse();
		response.setRequestId(request.getRequestId());
		response.setPayload(getMockPayload());
		
		return response;
	}
	
	private SyncPayload getMockPayload() {
		Name name = new Name();
		name.setName("Night light");
		
		List<String> traits = new ArrayList<>(); 
		traits.add("action.devices.traits.OnOff");
		
		Devices devices = new Devices();
		devices.setId("123");
		devices.setName(name);
		devices.setTraits(traits);
		devices.setType("action.devices.types.OUTLET");
		devices.setWillReportState(false);
		
		SyncPayload payload = new SyncPayload();
		payload.setAgentUserId("1452");
		payload.setDevices(devices);
		
		return payload;
	}

}

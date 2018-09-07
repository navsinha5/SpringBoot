package assistantiot.fulfillment.services;

import assistantiot.fulfillment.pojo.Request;
import assistantiot.fulfillment.pojo.SyncResponse;

public interface FulfillmentService {
	
	public SyncResponse getFulfillment(Request request);

}

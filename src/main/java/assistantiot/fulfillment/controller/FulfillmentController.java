package assistantiot.fulfillment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import assistantiot.fulfillment.pojo.Request;
import assistantiot.fulfillment.pojo.SyncResponse;
import assistantiot.fulfillment.services.FulfillmentService;

@RestController
@CrossOrigin
public class FulfillmentController {
	
	@Autowired
	@Qualifier("fulfillmentServiceImpl")
	FulfillmentService fulfillmentService; 
	
	
	@RequestMapping(value = "/assistantiot", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public SyncResponse fulfillmentHandler(@RequestBody Request request) {
		System.out.println("Entered85415654654///////////");
		return fulfillmentService.getFulfillment(request);
		
	}
	
	
	@RequestMapping(value = "/health", method = RequestMethod.GET)
	@ResponseBody
	public String healthCheck() {
		return "breathing...";
	}
	

}

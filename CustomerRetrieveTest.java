


import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.module.http.api.HttpConstants;
import org.mule.module.http.api.client.HttpRequestOptions;
import org.mule.module.http.api.client.HttpRequestOptionsBuilder;
import org.mule.tck.junit4.FunctionalTestCase;



public class CustomerRetrieveTest extends FunctionalTestCase {

		private MuleClient client;
		private DefaultMuleMessage request;
		private HttpRequestOptions options;
		private String apiUrl;
	
		
		@Before
		public void setup()
		{
			
			MuleClient client = muleContext.getClient(); 
			DefaultMuleMessage request = new DefaultMuleMessage("getCustomer", null, null, null, muleContext); 
			HttpRequestOptions options = HttpRequestOptionsBuilder.newOptions()
					.method(HttpConstants.Methods.GET.name())
					.build();
			
			this.client=client;
			this.request=request;
			this.options=options;
			this.apiUrl="http://localhost/api";
		
			
		}
	
	@Test
	public void getValidCustomerTest() throws Exception {
		 
		String url = apiUrl+"/customers/3";
	
        MuleMessage response = client.send(url, request, options); 

		String responsePayload = response.getPayloadAsString();
		Integer httpStatus = response.getInboundProperty("http.status");
	
		assertTrue( (responsePayload.length() > 0) && httpStatus.intValue() == 200);
	}
	
	
}

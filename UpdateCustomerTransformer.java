package au.com.customers.transformer;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import au.com.customers.model.CustomerResponse;




public class UpdateCustomerTransformer extends AbstractMessageTransformer  {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {

		try {
			String request = message.getPayloadAsString();
			
			System.out.println("request-----"+request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CustomerResponse response = new CustomerResponse();
		response.setCustomerId("3");
		return response;

		
	}


	

	}





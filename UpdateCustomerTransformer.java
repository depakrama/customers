package au.com.customers.transformer;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import au.com.customers.model.CustomerResponse;

/**
 * @author Depak
 * Java Transformer Class for update customer
 *
 */
public class UpdateCustomerTransformer extends AbstractMessageTransformer {

	/* (non-Javadoc)
	 * this method extracts the customer Id from the URI and builds the response.
	 */
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {

		try {
			String request = message.getPayloadAsString();

			System.out.println("request-----" + request);
		} catch (Exception e) {
			e.printStackTrace();
		}

		CustomerResponse response = new CustomerResponse();
		response.setCustomerId("3");
		return response;

	}

}

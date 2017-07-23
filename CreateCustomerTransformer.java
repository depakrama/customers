package au.com.customers.transformer;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import au.com.customers.model.CustomerResponse;

/**
 * @author Depak Java Transformer Class to get the payload and generate JSON
 *         Response.
 *
 */
public class CreateCustomerTransformer extends AbstractMessageTransformer {

	/*
	 * (non-Javadoc) This Method gets the JSON Payload and builds the JSON
	 * Response for POST Create Customer.
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
		response.setCustomerId("2");
		return response;

	}

}

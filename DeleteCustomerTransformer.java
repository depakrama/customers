package au.com.customers.transformer;

import java.util.Map;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import au.com.customers.model.CustomerResponse;

/**
 * @author Depak
 * Java Transformer Class for DELETE call for Customer
 *
 */
public class DeleteCustomerTransformer extends AbstractMessageTransformer {

	/* (non-Javadoc)
	 * This method extracts the customer Id and builds the response.
	 */
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		String cusId = "";
		try {

			Map<String, String> UriParams = message.getInboundProperty("http.uri.params");
			cusId = UriParams.get("customer");
			System.out.println("customer id: " + cusId);

		} catch (Exception e) {
			e.printStackTrace();
		}

		CustomerResponse response = new CustomerResponse();
		return response;

	}

}

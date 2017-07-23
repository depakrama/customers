package au.com.customers.transformer;

import java.util.Map;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import au.com.customers.model.GetCustomerResponse;

/**
 * @author Depak Java Transformer Class for GET call for Get Customer based on
 *         Customer Id.
 *
 */
public class getCustomerTransformer extends AbstractMessageTransformer {

	/*
	 * (non-Javadoc) this method gets the Customer Id from the uri and builds
	 * the response.
	 */
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		String cusId = "";
		try {

			Map<String, String> UriParams = message.getInboundProperty("http.uri.params");
			cusId = UriParams.get("customer");
			System.out.println("customer id: " + cusId);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		GetCustomerResponse response = new GetCustomerResponse();
		response.setCustomerId(cusId);
		response.setName("test");
		response.setSuburb("merrylands");
		response.setStreet("st ann ");
		response.setPostalcode("2160");
		return response;

	}

}

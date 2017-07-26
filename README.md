# customers
 
Commentary on the interaction of use case 1 with the API
The Third Party API will be consuming the customers API for every 5 minutes. so there can be a JMS Topic, and the request(with provider Id) will be put in this queue in a subflow. in that subflow the request will be taken and provider Id can be saved for audit purposes.
 
 Commentary on interaction of use case 2 with the API.
The API Documentation can be shared and from any mobile app, the REST API can be invoked.

 Commentary on how the API could be extended for use case 3
In Future if orders are introduced, the API can be extended like below.
/customers/{customer}/orders
this will display all the orders of a particular customer.

 Commentary on any 'interesting' design decisions you made (and alternative options considered)
There is a main flow for This is a simple consideration done.
1) Main flow is designed
	Each API is designed as sub flow and from main flow using flow-ref the sub flows are invoked.
Alternative :
instead of creating sub flows, all the API could be added in main flow itself.

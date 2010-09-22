package org.datafuser.server;

import org.datafuser.client.DataService;
import org.datafuser.shared.data.IDataSet;

public class DataServiceImpl extends com.google.gwt.user.server.rpc.RemoteServiceServlet implements
		DataService {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7989196200718210558L;

	public IDataSet greetServer(String dataSetID)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

}

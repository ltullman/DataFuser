package org.datafuser.client;

import org.datafuser.shared.data.IDataSet;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("data")
public interface DataService extends RemoteService {
	IDataSet greetServer(String dataSetID) throws IllegalArgumentException;
}

package org.datafuser.client;

import org.datafuser.shared.data.IDataSet;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DataServiceAsync {
	void greetServer(String name, AsyncCallback<IDataSet> callback) throws IllegalArgumentException;

}

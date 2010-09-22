package org.datafuser.server.data.retrieve;

import org.datafuser.server.data.process.IDataProcessor;
import org.datafuser.shared.data.IDataSetMetadata;

public interface IDataRetriever {

	public void setMetadata(IDataSetMetadata idsm);
	
	public boolean retrieve(IDataProcessor processor) throws Exception;
}

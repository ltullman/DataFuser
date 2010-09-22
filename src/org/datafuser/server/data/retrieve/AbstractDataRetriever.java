package org.datafuser.server.data.retrieve;

import org.datafuser.shared.data.IDataSetMetadata;

public abstract class AbstractDataRetriever implements IDataRetriever {

	protected IDataSetMetadata metadata;

	public void setMetadata(IDataSetMetadata idsm) {
		this.metadata = idsm;

	}

}

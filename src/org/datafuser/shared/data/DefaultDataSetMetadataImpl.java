package org.datafuser.shared.data;

import java.util.Map;

public class DefaultDataSetMetadataImpl implements IDataSetMetadata {

	private boolean fetched = false;
	private Map<String, Object> properties = null;
	private RetrieverType type = null;
	
	public Map<String, Object> getProperties() {
		// TODO Auto-generated method stub
		return properties;
	}

	public RetrieverType getRetrieverType() {
		// TODO Auto-generated method stub
		return type;
	}

	public boolean isFetched() {
		// TODO Auto-generated method stub
		return fetched;
	}

	public void setProperties(Map<String, Object> props) {
		// TODO Auto-generated method stub

	}

	public void setRetrieverType(RetrieverType rt) {
		// TODO Auto-generated method stub

	}

}

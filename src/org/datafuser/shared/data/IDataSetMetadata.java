package org.datafuser.shared.data;

import java.util.Map;

public interface IDataSetMetadata {

	public RetrieverType getRetrieverType();
	
	public void setRetrieverType(RetrieverType rt);
	
	public Map<String, Object> getProperties();
	
	public void setProperties(Map<String, Object> props);
	
	public boolean isFetched();
	
	
}

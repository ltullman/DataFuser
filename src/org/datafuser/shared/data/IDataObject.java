package org.datafuser.shared.data;

import java.util.List;
import java.util.Map;

public interface IDataObject extends Map<String, Object> {
	
	public IDataObject getParent();
	
	public List<IDataObject> getChildren();
	
}

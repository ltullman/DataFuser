package org.datafuser.server.data.process;

import org.datafuser.shared.data.IDataObject;
import org.datafuser.shared.data.IDataSet;

public class DefaultDataProcessorImpl implements IDataProcessor {

	public void process(IDataSet set) {
		// TODO Auto-generated method stub
		
		
		// implement basic persistence to the data store
		IDataObject obj;
		for ( int i = 0; i < set.getRowCount(); i++ ) {
			obj = set.getObjectAt(i);
			// persist the object
			persist(obj);
		}
	}

	private boolean persist(IDataObject obj) {
		boolean success = true;
		
		
		
		return success;
	}
}

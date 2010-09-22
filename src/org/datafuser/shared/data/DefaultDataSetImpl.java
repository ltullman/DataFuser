package org.datafuser.shared.data;

import java.util.HashMap;
import java.util.Map;

public class DefaultDataSetImpl implements IDataSet {

	public DefaultDataSetImpl() {
		// TESTING DATA
		loadTestData();
	}
	
	private Object[] data = new Object[100];
	static final int MAX = 100;
	private void loadTestData() {
		// TODO Auto-generated method stub
		for ( int i = 0; i < MAX; i++) {
			Map<String, Object> m = new HashMap<String, Object>();
			
		}
 	}

	public IDataObject getObjectAt(int row) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addObject(IDataObject obj) {
		// TODO Auto-generated method stub
		
	}

}

package org.datafuser.shared.data;

public interface IDataSet {
	public int getRowCount();
	public IDataObject getObjectAt(int row);
	public void addObject(IDataObject obj);
}

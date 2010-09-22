package org.datafuser.shared.data;

import org.datafuser.shared.util.FactoryUtils;

public class DataFactory {

	private DataFactory() {}
	
	private static String kDataSetClass 		= "org.datafuser.shared.data.DefaultDataSetImpl";
	private static String kDataSetMetadataClass = "org.datafuser.shared.data.DefaultDataSetMetadataImpl";

	public static IDataSetMetadata createDataSetMetadata() {
		return createDataSetMetadata(kDataSetMetadataClass);
	}
	
	public static IDataSetMetadata createDataSetMetadata(String clazz) {
		return (IDataSetMetadata) FactoryUtils.instantiate(clazz);
	}	
	
	public static IDataSet createDataSet() {
		return createDataSet(kDataSetClass);
	}
	
	public static IDataSet createDataSet(String clazz) {
		return (IDataSet) FactoryUtils.instantiate(clazz);
	}
		
}

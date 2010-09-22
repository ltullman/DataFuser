package org.datafuser.server.data.retrieve;

import org.datafuser.shared.data.IDataSetMetadata;
import org.datafuser.shared.util.FactoryUtils;

public class DataRetrieverFactory {

	private DataRetrieverFactory() {}
	
	// TODO: add way to override default implementations.
	private static String kRSSDataRetrieverClass 	= "org.datafuser.server.data.retrieve.RSSDataRetrieverImpl";
	//private static String kDataSetMetadataClass 	= "org.datafuser.shared.data.DefaultDataSetMetadataImpl";

	public static IDataRetriever createDataSetRetriever(IDataSetMetadata idsm) {
		String clazz = null;
		
		switch (idsm.getRetrieverType()) {
		case RSS : clazz = kRSSDataRetrieverClass; break;
		}
		
		return (IDataRetriever) FactoryUtils.instantiate(clazz);
	}	
	
}

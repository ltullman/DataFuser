package org.datafuser.server.data.process;

import org.datafuser.shared.data.IDataSetMetadata;
import org.datafuser.shared.util.FactoryUtils;

public class DataProcessorFactory {

	private DataProcessorFactory() {}
	
	// TODO: add way to override default implementations.
	private static String kRSSDataProcessorClass 	= "org.datafuser.server.data.parse.RSSDataProcessorImpl";
	//private static String kDataSetMetadataClass 	= "org.datafuser.shared.data.DefaultDataSetMetadataImpl";

	public static IDataProcessor createDataSetProcessor(IDataSetMetadata idsm) {
		String clazz = null;
		
		switch (idsm.getRetrieverType()) {
		case RSS : clazz = kRSSDataProcessorClass; break;
		}
		
		return (IDataProcessor) FactoryUtils.instantiate(clazz);
	}	
	
}

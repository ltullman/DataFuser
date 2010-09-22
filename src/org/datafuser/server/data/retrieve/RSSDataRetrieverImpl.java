package org.datafuser.server.data.retrieve;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.datafuser.server.data.process.IDataProcessor;
import org.datafuser.shared.data.DataFactory;
import org.datafuser.shared.data.IDataObject;
import org.datafuser.shared.data.IDataSet;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class RSSDataRetrieverImpl extends AbstractHTTPRetriever {

	public boolean retrieve(IDataProcessor processor) throws Exception {

		// xml document
		//String results = getResultsFromURL();

		// parse the document now into data objects
		IDataSet ds = parse((String) this.metadata.getProperties().get(kURL));
		
		processor.process(ds);
		
		// TODO Auto-generated method stub
		return false;
	}

	private IDataSet parse(String url) throws ParserConfigurationException, SAXException, IOException {
		IDataSet ds = DataFactory.createDataSet();
		
		/// parse it out here - get the document
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db. parse(url);
		
		// iterate over the nodes now
		/// do we need some kind of mapping here?
		Element root = doc.getDocumentElement();
		List<IDataObject> list = extractObjects(root);
		
		for ( IDataObject idobj : list ) {
			ds.addObject(idobj);
		}
		
		return ds;
	}

	/**
	 * Recursively create objects based on the passed in node.  The node passed in will represent an object, and any 
	 * child objects will have it set as the parent object.  All attributes and elements with 0 children will be represented
	 * as a key/value pair on the data object
	 * 
	 * 
	 * @param e
	 * @return
	 */
	private List<IDataObject> extractObjects(Element e) {
		List<IDataObject> l = new ArrayList<IDataObject>();
		
		
		
		// TODO Auto-generated method stub
		return l;
	}
	
}

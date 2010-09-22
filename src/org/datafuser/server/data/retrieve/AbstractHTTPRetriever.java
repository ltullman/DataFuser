package org.datafuser.server.data.retrieve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class AbstractHTTPRetriever extends AbstractDataRetriever {

	public static final String kURL = "url";
	
	protected String getResultsFromURL() {
		StringBuffer data = new StringBuffer();		
		
		String strUrl = (String) this.metadata.getProperties().get(kURL);

        try {
            URL url = new URL(strUrl);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                data.append(line);
            }
            reader.close();

        } catch (MalformedURLException e) {
            // ...
        } catch (IOException e) {
            // ...
        }	
		
		return data.toString();
	}
	
}

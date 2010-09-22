package org.datafuser.shared.util;

public class FactoryUtils {

	private FactoryUtils() {}
	
	public static Object instantiate(String clazz) {
		
		try {
			Class<?> c = Class.forName(clazz);
			return c.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}

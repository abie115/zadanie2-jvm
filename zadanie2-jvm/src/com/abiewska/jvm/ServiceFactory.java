package com.abiewska.jvm;

public class ServiceFactory {
	public static Service newInstance() throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {

		ClassLoader myCL = new CustomClassLoader();

		return (Service) myCL.loadClass("com.abiewska.jvm.ServiceImpl")
				.newInstance();
	}
}

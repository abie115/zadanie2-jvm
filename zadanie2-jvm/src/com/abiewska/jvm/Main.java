package com.abiewska.jvm;

public class Main {
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			InterruptedException {
		Service s1, s2;
		s1 = ServiceFactory.newInstance();
		s2 = new ServiceImpl();
		
		System.out.println("Ss1: " + s1.getClass().getClassLoader());
		System.out.println("Ss2: " + s2.getClass().getClassLoader());
		
		while (true) {
			System.out.println("1. " + s1.helloMessage());
			System.out.println("2. " + s2.helloMessage());
			System.out.println();

			Thread.sleep(3000);
		}
	}

}

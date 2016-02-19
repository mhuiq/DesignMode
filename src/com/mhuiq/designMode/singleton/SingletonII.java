package com.mhuiq.designMode.singleton;

public class SingletonII {
	
	private static SingletonII instance = null;
	
	private SingletonII() {
	}

	private static synchronized void createInstance() {
		if (null == instance) {
			instance = new SingletonII();
		}
	}
	
	public static SingletonII getInstance() {
		if (null == instance) {
			createInstance();
		}
		return instance;
	}
}

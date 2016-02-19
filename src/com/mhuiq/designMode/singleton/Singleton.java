package com.mhuiq.designMode.singleton;

public class Singleton {

	private Singleton() {
	}
	
	// 使用静态内部类
	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}
	
	public Singleton getInstance() {
		return SingletonFactory.instance;
	}
	
}

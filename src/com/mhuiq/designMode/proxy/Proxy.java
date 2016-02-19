package com.mhuiq.designMode.proxy;

public class Proxy implements Sourceable {

	private Source source;
	
	public Proxy() {
		super();
		this.source = new Source(); //注：这里跟装饰器模式的主要区别
	}
	
	@Override
	public void method() {
		before();
		source.method();
		after();
	}
	
	private void before() {
		System.out.println("this is before method");
	}
	
	private void after() {
		System.out.println("this is after method");
	}
}

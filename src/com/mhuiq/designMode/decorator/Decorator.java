package com.mhuiq.designMode.decorator;

public class Decorator implements Sourceable {

	private Source source;
	
	public Decorator(Source source) {
		super();
		this.source = source; // 这里跟代理模式区别，装饰器模式这里需要传入参数
	}

	@Override
	public void method1() {
		System.out.println("before decorator");
		source.method1();
		System.out.println("after decorator");
	}
	
}

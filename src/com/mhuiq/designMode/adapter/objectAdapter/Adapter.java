package com.mhuiq.designMode.adapter.objectAdapter;

public class Adapter implements Targetable {
	
	Source source = new Source();
	
	@Override
	public void method1() {
		source.method1();
	}
	
	@Override
	public void method2() {
		System.out.println("this is Targetbale method2");
	}

}

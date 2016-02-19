package com.mhuiq.designMode.multiTaskFuture;

import java.util.concurrent.Callable;

public class RealData implements Callable<String> {

	private String para;
	
	public RealData(String para) {
		this.para = para;
	}
	
	@Override
	public String call() throws Exception {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<10; ++i) {
			sb.append(para);
		}
		Thread.sleep(5000);
		return sb.toString();
	}

}

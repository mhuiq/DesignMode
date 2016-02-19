package com.mhuiq.designMode.masterWorker;

import java.util.Map;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {
		Master master = new Master(new PlusWorker(), 5);
		for (int i=0; i<100; ++i) {
			master.submit(i);
		}
		master.executte();
		int re = 0;
		Map<String, Object> resultMap = master.getResult();
		
		while (resultMap.size() > 0 || !master.isComplete()) {
			Set<String> keys = resultMap.keySet();
			String key = null;
			for (String k : keys) {
				key = k;
				break;
			}
			Integer i = null;
			if (null != key)
				i = (Integer) resultMap.get(key);
			if (null != i) 
				re += i;
			if (null != key)
				resultMap.remove(key);
		}
		
		System.out.println(re);
	}
}

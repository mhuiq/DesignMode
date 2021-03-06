package com.mhuiq.designMode.masterWorker;

import java.util.Map;
import java.util.Queue;

public class Worker implements Runnable {
	
	// 任务队列，用于取得子任务
	protected Queue<Object> workQueue;
	// 子任务处理结果集
	protected Map<String, Object> resultMap;
	
	public void setWorkQueue(Queue<Object> workQueue) {
		this.workQueue = workQueue;
	}
	
	public void setResultMap(Map<String, Object> resultMap) {
		this.resultMap = resultMap;
	}
	
	public Object handle(Object input) {
		return input;
	}
	
	@Override
	public void run() {
		while (true) {
			Object input = workQueue.poll();
			if (null == input)
				break;
			Object re = handle(input);
			resultMap.put(Integer.toString(input.hashCode()), re);
		}
		
	}

}

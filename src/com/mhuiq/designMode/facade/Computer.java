package com.mhuiq.designMode.facade;

public class Computer {
	private CPU cpu ;
	private Display display;
	private Memory memory;
	public Computer() {
		this.cpu = new CPU();
		this.display = new Display();
		this.memory = new Memory();
	}
	public void startup() {
		System.out.println("computer starting");
		cpu.startup();
		display.startup();
		memory.startup();
		System.out.println("computer started");
	}
	public void shutdown() {
		System.out.println("computer shutting down");
		cpu.shutdown();
		display.shutdown();
		memory.shutdown();
		System.out.println("computer shutdown");
	}
}

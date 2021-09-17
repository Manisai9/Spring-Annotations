package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Oneplus
{
	@Autowired
	MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() 
	{
		System.out.println("Oneplus Nord 2");
		System.out.println("Dimensity core,12 gb Ram, 50MP camera");
		cpu.process();
	}
}

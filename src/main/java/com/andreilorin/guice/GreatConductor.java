package com.andreilorin.guice;

import lombok.Data;

@Data
public class GreatConductor implements Conductor {

	private String name;
	private String performance;
		
	public GreatConductor() {
		this.name = "Andrei";
		this.performance = "Great";
	}
	
	@Override
	public void leadOrchestra() {
		System.out.println("lead the orchestra with a");
	}

	@Override
	public void getConductorInfo() {
		System.out.println("The name is " + this.getName() + " and the performance was " + this.performance);
	}
}

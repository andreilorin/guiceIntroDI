package com.andreilorin.guice;

public class GuitarElectric implements Guitar {

	@Override
	public void playGuitarTune() {
		System.out.println("guitar playing");
	}
}

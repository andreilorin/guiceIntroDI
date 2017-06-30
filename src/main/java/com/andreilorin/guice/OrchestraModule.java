package com.andreilorin.guice;

import com.google.inject.AbstractModule;

public class OrchestraModule extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(Guitar.class).to(GuitarElectric.class);
		bind(Piano.class).to(PianoElectric.class);
		bind(Conductor.class).to(GreatConductor.class);
	}
}

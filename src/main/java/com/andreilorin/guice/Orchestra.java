package com.andreilorin.guice;

import com.google.inject.Inject;

public class Orchestra {

	private final Guitar guitar;
	private final Piano piano;
	private final Conductor conductor;
	
	@Inject
	public Orchestra(Guitar guitar, Piano piano, Conductor conductor) {
		this.guitar = guitar;
		this.piano = piano;
		this.conductor = conductor;
	}
	
	public void playOrchestra() {
		guitar.playGuitarTune();
		piano.playPianoTune();
	}
	
	public void getConductorInfo() {
		conductor.getConductorInfo();
	}
	
}

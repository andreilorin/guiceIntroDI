package com.andreilorin.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App 
{
    public static void main( String[] args ) {
    	
    	Injector injector = Guice.createInjector(new OrchestraModule());
    	
    	Orchestra orchestra = injector.getInstance(Orchestra.class);
    	
    	orchestra.playOrchestra();
    	
    	orchestra.getConductorInfo();
    }
}

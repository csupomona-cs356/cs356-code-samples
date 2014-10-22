package edu.csupomona.cs356.mysocial;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    		Injector injector = Guice.createInjector(new MySocialAppModule());    		
        MySocialApp app = injector.getInstance(MySocialApp.class);
        
        app.sendMyMessage("Test in class");
        app.displayNewsFeed();
    }
}

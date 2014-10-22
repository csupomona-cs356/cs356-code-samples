package edu.csupomona.cs356.inject.app;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Driver {
	 
    public static void main(String[] args) {
    	
    	
    	Injector injector = Guice.createInjector(new MySocialAppModule());     
    	MySocialApplication app  = injector.getInstance(MySocialApplication.class);
    	        
        app.sendMessage("Hi there", "abc@abc.com");
        app.displayNewsFeed();
        
        MyTextingService texting = injector.getInstance(MyTextingService.class);
                
    }
 
}
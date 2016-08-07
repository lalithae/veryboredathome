package com.eooz.common.command;

import java.util.HashMap;
import java.util.Map;

public abstract class CmdFactoryService {
	
	// holds onto a list of factories. This is a static list, so use them wisely.
	// Don't blame me for memory leaks caused by your careless use of this design.
	private static Map<String, CommandFactory> factoryList = new HashMap<String, CommandFactory>();
	
	
	
	// no one creates me, but ME!
	private CmdFactoryService(){}
	
		
	 //looks up the factoryList and returns the factory object in it.
	public static CommandFactory getFactory(String identifier) {
		
		return factoryList.get(identifier);
		
	}

	//The CommandFactory s use this method to register it self with the CmdFactoryService
	public static void register(String identifier, PostCommandFactory postCommandFactory) {
		
		factoryList.put(identifier, postCommandFactory);
		
	}


	
}

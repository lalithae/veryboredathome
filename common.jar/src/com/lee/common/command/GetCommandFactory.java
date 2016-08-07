// 20160730 SAM created GetCommandFactory
package com.eooz.common.command;

import java.util.HashMap;
import java.util.Map;

import com.eooz.common.operation.GetOperation;
import com.eooz.common.operation.Operation;

public class GetCommandFactory extends CmdFactoryService {
	
	
	private static Map<String, ICommand> commands = new HashMap<String, ICommand>();
	
	private GetCommandFactory(){}
	

	@Override
	public ICommand getCommand(String command, Operation operation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CmdFactoryService create() {
		return new GetCommandFactory();
	}


	

	
}
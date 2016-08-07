package com.eooz.common.command;

import com.eooz.common.util.RequestWrap;
import com.eooz.common.util.ResponseWrap;

public interface ICommand {

	public String doWork();

	public void setRequest(RequestWrap request);

	public void setResponse(ResponseWrap response);
	
}

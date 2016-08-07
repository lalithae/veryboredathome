// 20160730 SAM created GetOperation
package com.eooz.common.operation;

import java.util.Collection;

public interface GetOperation extends Operation {
	
	public Collection<Object> getCollection(Collection<Object> list, String queryString);
	
	public Object getInstance(Collection<Object> list, String queryString);
	
}
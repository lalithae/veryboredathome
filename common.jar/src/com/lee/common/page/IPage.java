// 20160730 SAM created RequestObject
package com.eooz.common.page;

import com.eooz.common.form.Form;

public interface IPage {
	
	public Form getForm();
	public void setForm(Form f);

	public String getError();
	public void setError(String err);
	
	public String getHref();
	public void setHref(String url);
	
	


	
}
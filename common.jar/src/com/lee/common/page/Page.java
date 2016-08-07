package com.eooz.common.page;

import com.eooz.common.form.Form;

public class Page implements IPage {

	private String error;
	private String href;
	private Form form;
	
	@Override
	public Form getForm() {
		return form;
	}

	@Override
	public void setForm(Form f) {
		this.form = f;
	}

	@Override
	public String getError() {
		return error;
	}

	@Override
	public void setError(String err) {
		this.error = err;
	}

	@Override
	public String getHref() {
		return href;
	}

	@Override
	public void setHref(String href) {
		this.href = href;
	}

	


}

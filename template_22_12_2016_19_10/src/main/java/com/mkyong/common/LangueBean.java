package com.mkyong.common;

import java.io.Serializable;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="language")
@SessionScoped
public class LangueBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String activerFR() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(Locale.FRENCH);
		return null;
		
	}
	
	public String activerEN() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(Locale.ENGLISH);
		return null;
		
		
	}
	
	public String activerCH() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(Locale.SIMPLIFIED_CHINESE);
		return null;
		
		
	}
	
}

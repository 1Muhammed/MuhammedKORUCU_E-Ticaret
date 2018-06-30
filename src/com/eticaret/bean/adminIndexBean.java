package com.eticaret.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class adminIndexBean {

	private String ortaalanURL;

	public adminIndexBean () {
		
		this.ortaalanURL="mainpage.xhtml";
		
	}
	
	public void URLsec (int id) {
		
	switch (id) {
	case 1:ortaalanURL="mainpage.xhtml";break;
	case 2:ortaalanURL="kategori.xhtml";break;	
	case 3:ortaalanURL="urun.xhtml";break;
	case 4:ortaalanURL="fiyat.xhtml";break;	

	default:
		break;
	}	
	}
	
	
	public String getOrtaalanURL() {
		return ortaalanURL;
	}

	public void setOrtaalanURL(String ortaalanURL) {
		this.ortaalanURL = ortaalanURL;
	}
	
	
}

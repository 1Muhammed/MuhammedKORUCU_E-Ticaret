package com.eticaret.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class adminIndexBean {

	private String ortaalanURL;

	private int secilenid;
	
	public int getSecilenid() {
		return secilenid;
	}

	public void setSecilenid(int secilenid) {
		this.secilenid = secilenid;
	}

	public adminIndexBean () {
		
		this.ortaalanURL="mainpage.xhtml";
		
	}
	
	public void URLsec (int id) {
		
	switch (secilenid) {
	case 1:ortaalanURL="mainpage.xhtml";break;
	case 2:ortaalanURL="kategori.xhtml";break;	
	case 3:ortaalanURL="urun.xhtml";break;
	case 4:ortaalanURL="fiyat.xhtml";break;	

	default:ortaalanURL="mainpage.xhtml";break;
		
		}	
	}
	
	
	public String getOrtaalanURL() {
		return ortaalanURL;
	}

	public void setOrtaalanURL(String ortaalanURL) {
		this.ortaalanURL = ortaalanURL;
	}
	
	
}

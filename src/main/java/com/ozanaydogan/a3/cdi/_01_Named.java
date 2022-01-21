package com.ozanaydogan.a3.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class _01_Named implements Serializable {
	private static final long serialVersionUID = -1306256027076814974L;
	private String takımName;
	
	// parametresiz constructor
	public _01_Named() {
		this.takımName = "Besiktas";
	}
	
	// parametreli constructor
	public _01_Named(String takımName) {
		this.takımName = takımName;
	}
	
	@Override
	public String toString() {
		return "Takım [takımName=" + takımName + "]";
	}
	
	public String getTakımName() {
		return takımName;
	}
	
	public void setTakımName(String takımName) {
		this.takımName= takımName;
	}
	
}

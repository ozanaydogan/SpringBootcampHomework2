package com.ozanaydogan.a6.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("qualiferCDI")
@ApplicationScoped
public class QualiferManagerDB implements Serializable {
	private static final long serialVersionUID = 1397860167944776376L;
	
	// // default icin
	// @Inject
	// private IJavaVersion iJavaVersion;
	
	// default icin
	@Inject
	@QualifierCokluSecim
	private DatabaseType iDatabaseType;
	
	public String getiDatabaseType() {
		return iDatabaseType.aDatabaseType(" Sürüm ");
	}
	
}

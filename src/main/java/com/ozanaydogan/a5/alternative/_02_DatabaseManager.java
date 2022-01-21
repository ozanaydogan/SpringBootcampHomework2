package com.ozanaydogan.a5.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeCDI")
@ApplicationScoped
public class _02_DatabaseManager {
	
	@Inject
	private _01_DatabaseType iDatabase;
	
	public String getiDatabase() {
		return iDatabase.DBVersion("sürümler :");
	}
}

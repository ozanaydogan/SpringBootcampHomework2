package com.ozanaydogan.a6.qualifier;

import javax.enterprise.inject.Default;

// Defautta bu obje gelsin
@Default
public class SQL implements DatabaseType {
	
	@Override
	public String aDatabaseType(String data) {
		return "Default SQL";
	}
	
}

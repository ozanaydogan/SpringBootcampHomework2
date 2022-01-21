package com.ozanaydogan.a6.qualifier;

@QualifierCokluSecim
public class Mysql implements DatabaseType {
	
	@Override
	public String aDatabaseType(String data) {
		return "Opsiyonel Mysql";
	}
	
}
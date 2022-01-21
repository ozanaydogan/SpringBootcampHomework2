package com.ozanaydogan.a5.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class _02_OracleSql implements _01_DatabaseType {
	
	@Override
	public String DBVersion(String data) {
		return "Oracle Sql";
	}
	
}

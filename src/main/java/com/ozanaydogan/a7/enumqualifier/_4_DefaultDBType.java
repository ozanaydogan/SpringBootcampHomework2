package com.ozanaydogan.a7.enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class _4_DefaultDBType implements _3_IDatabaseType {
	
	@Override
	public String DBversion(String data) {
		return "Default DB version SQL";
	}
	
}

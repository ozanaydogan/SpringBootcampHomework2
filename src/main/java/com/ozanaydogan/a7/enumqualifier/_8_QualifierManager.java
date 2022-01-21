package com.ozanaydogan.a7.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped
public class _8_QualifierManager {
	
	@Inject
	@_2_EQualifier(_1_EDatabaseType.MySql)
	_3_IDatabaseType iDBversion;
	
	public String getiDBversion() {
		return iDBversion.DBversion("Seçim");
	}
	
}

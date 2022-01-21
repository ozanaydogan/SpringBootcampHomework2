package com.ozanaydogan.a2.manueliocli.cdili;

import javax.inject.Inject;

public class _02_DatabaseManager {
	
	// interface çağır
	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	private _01_DatabaseType DBInterface;
	
	// paramatreli constructor
	public _02_DatabaseManager(_01_DatabaseType DBInterface) {
		this.DBInterface = DBInterface;
	}
	
	// Metot
		public void newDatabase() {
			DBInterface.DBVersion();
	}
	
}

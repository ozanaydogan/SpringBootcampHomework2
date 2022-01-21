package com.ozanaydogan.a1.iocli.cdisiz;

public class _02_DatabaseManager {
	
	// interface çağır
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

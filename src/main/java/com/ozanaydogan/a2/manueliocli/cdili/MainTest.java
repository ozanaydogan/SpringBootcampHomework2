package com.ozanaydogan.a2.manueliocli.cdili;

public class MainTest {
	
	public static void main(String[] args) {
		_02_DatabaseManager javaManager = new _02_DatabaseManager(new _02_OracleSql());
		javaManager.newDatabase();
		
	}
	
}

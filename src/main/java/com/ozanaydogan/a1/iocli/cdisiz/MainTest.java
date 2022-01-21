package com.ozanaydogan.a1.iocli.cdisiz;

public class MainTest {
	
	public static void main(String[] args) {
		_02_DatabaseManager DBManager = new _02_DatabaseManager(new _02_Mssql());
		DBManager.newDatabase();
		
	}
	
}

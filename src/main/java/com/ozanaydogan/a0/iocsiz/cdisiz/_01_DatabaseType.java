package com.ozanaydogan.a0.iocsiz.cdisiz;
public class _01_DatabaseType {
	
	
	public void DBVersion(String version) {
		if (version.equals("oracle")) {
			System.out.println("oracle");
		} else if (version.equals("Mssql")) {
			System.out.println("Mssql");
		} else if (version.equals("MySql")) {
			System.out.println("MySql");
		} else {
			System.out.println("Farklı bir sürüm girdiniz");
		}
		
	}
	
}

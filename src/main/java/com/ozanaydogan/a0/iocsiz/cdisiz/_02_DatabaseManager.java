package com.ozanaydogan.a0.iocsiz.cdisiz;
public class _02_DatabaseManager {
	
	// Herhangi bir Database nesnesi oluşturamıyoruz çünkü, proje genelinde herhangi bir veritabanı class
	// yapısı oluşturup bu yapıdan objeler üretmedik. DatabaseType yapısında spagetti kod olarak if elseler
	// kullanarak sadece String sorgusu yapmış olduk. kısacası tamamiyle yanlış bir kullanımdır.
	public void newDatabase() {
		_01_DatabaseType Database = new _01_DatabaseType();
		Database.DBVersion("MySql");
	}
	
}

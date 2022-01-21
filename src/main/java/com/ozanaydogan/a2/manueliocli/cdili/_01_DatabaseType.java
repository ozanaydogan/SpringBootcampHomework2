package com.ozanaydogan.a2.manueliocli.cdili;

public interface _01_DatabaseType {
	
	//interface yapısı
	//İlk olarak bir interface yapısı oluşturduk.
	//Bu yapı, bu yapıyı implement eden classların, bu yapıda bulunan metotları override edip,
	//bu metotları kendilerine göre doldurmalarını, kendilerine özel tasarlamalarını sağlar.
	
	// gövdesiz parametresiz metot
	public void DBVersion();
	
	
	default void Deneme() {
		System.out.println("Merhabalar");
	}
	
}

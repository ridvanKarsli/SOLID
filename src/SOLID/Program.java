package SOLID;

public class Program {
	
	public static void main(String[] args) {
		//Toplama toplama = new Toplama(); bu yanlış
		//IslemYapabilir islem = new Toplama();//bu doğru bir kural. Liskov Substitution 
		//new bağımlı hale getirir kullanmamak lazım
		IslemYapabilir islem = IslemFabrikası.getInstance();//new artık yok. Dependency Inversion
		
		double sonuc = islem.islemyap(1, 4);
		System.out.print(sonuc);
	}
}
/*
S) Single Responsibility : her şeyin tek bir görevi olur
O) Open/Closed : sınıflar gelişime açık değişime kapalı olmalı
L) Liskov Substitution : referanslar temel aldıkları sınıfların nesnelerini bilmeden kullanabilmeli
I) Interface Segregation : interfaceleri bölümlere böy 
D) Dependency Inversion : kodları bağımlı hale getirme.nesneler direkt kendilerini kullanmaz soyutlamalarını kullanmalı

Robert Cecil Martil(Uncle Bob) tarafından geliştirildi
*/
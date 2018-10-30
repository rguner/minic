package com.guner.sonar.denemeler;
public class StaticKonusu 
{
     
    public static void main(String args[]) 
    {
         
        StaticKonusu staticKonusu = new StaticKonusu();
        staticKonusu.execute();
    	
    }
    
    
    private void execute() {
    	System.out.println("Baslangicta ogrenci sayisi: " + StaticKonusuOgrenci.ogrenciSayisi);
        
        // iki tane ogrenci nesnesi olusturuyoruz
        StaticKonusuOgrenci ogrenci1 = new StaticKonusuOgrenci("Obi-Wan Kenobi", 19, "2010001");
        StaticKonusuOgrenci ogrenci2 = new StaticKonusuOgrenci("Anakin Skywalker", 16, "2010002");
         
        int ogrSayi = StaticKonusuOgrenci.ogrenciSayisi;
        System.out.println("Ogrenci sayisi (Sinif uzerinden): " + ogrSayi);
        
        ogrSayi = StaticKonusuOgrenci.getOgrenciSayisi();
        System.out.println("Ogrenci sayisi (Sinif uzerinden getOgrenciSayisi metodu ile): " + ogrSayi);
         
        ogrSayi = ogrenci1.ogrenciSayisi;
        System.out.println("Ogrenci sayisi (Ilk nesne uzerinden): " + ogrSayi);
         
        ogrSayi = ogrenci2.ogrenciSayisi;
        System.out.println("Ogrenci sayisi (Ikinci nesne uzerinden): " + ogrSayi);
        
        
		
	}
    
	
    
}
package com.guner.sonar.denemeler;
public class StaticKonusuOgrenci {
    	 
        private String isim;            // Nesne degiskeni
        private int yas;                     // Nesne degiskeni
        private String ogrenciNo;        // Nesne degiskeni
        public static int ogrenciSayisi = 0;    // Sinif degiskeni
         
        public StaticKonusuOgrenci(String isim, int yas, String ogrenciNo) {
             
            this.isim = isim;
            this.yas = yas;
            this.ogrenciNo = ogrenciNo;
                                 
            // Her nesne yaratildiginda sinif degiskenini artiriyoruz.
            ogrenciSayisi++;    
        }
        
        public static int getOgrenciSayisi() {
            return ogrenciSayisi;
        }
    }
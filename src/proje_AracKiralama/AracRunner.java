package proje_AracKiralama;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
   /*
 
​
1-
kullanıcı  islem fields -->
String alinacakSehir;
String alinacakGun; (MM,dd--> ay gun formatında olmalı)
double alisSaati;
String teslimGunu;  (MM,dd--> ay gun formatında olmalı)
double teslimSaati;
​
arac fields -->
String marka; (liste araclari --> opel toyota volvo)
String model;  (astra corolla s60)
String yakitTipi;  (diesel benzin)
String vites; (manuel otomatik)
double gunlukUcret; ( 100 120 150... liste dısı arac=300)
​
2-musteriden  yukarida ozellikleri verilen liste araclardan  
tercihini alınız. eger musteri farklı bir arac talep ederse
talep ettigi aracın fields'larını alınız.
musterinin ad, soyad, yas, telefon, id  ve kredi kartı bilgileri ile 
  arac tercihine ve islemine gore odemesini gerçekleştriniz..
​
    */
     public class AracRunner {
    static List<Musteri> musteriBilgileri = new ArrayList<>(Arrays.asList());
	 static List<AracDepo> aracListesi = new ArrayList<>(Arrays.asList());
	 static Scanner scan = new Scanner(System.in);
     static int aracNo=99;
	 public static void main(String[] args) {
          
		
		musteriMenu();		
	}
	private static void musteriMenu() {
 
		aracEkle(aracListesi);
		System.out.println();
		System.out.println("*********Lutfen yapmak istediginiz islemi seciniz**********  ");
        System.out.println("1-Arac Listeleme\n2-Kisisel Bilgiler\n3-Cikis");
		int secim=scan.nextInt();	
		switch (secim) {
		case 1:
			aracKiralama(aracNo);
			break;

		default:
			break;
	}		
	}
	
	private static void aracKiralama(int aracNo2) {

		System.out.println("Kiralamak istediginiz aracin aracNosunu giriniz");
		System.out.println(aracListesi);
		int no=scan.nextInt();

		for (AracDepo each : aracListesi) {
			if (each.getAracNo()==no) {
				System.out.println("Kiralamak istediiniz arac " + aracListesi.get(no-100));	
			musteriBilgileri(musteriBilgileri);
			
			}		
		} 
		
	}
	private static void musteriBilgileri(List<Musteri> musteriBilgileri) {
		/*
     String ad;String soyAd;String yas; String telefon; String id; String kartNo;
		 */
	 System.out.println();
	 System.out.println("Agam Hos Geldiniz Bilgilerini Alayim");
	 System.out.println("Isim Gir");
	 String isim=scan.next();	
	 System.out.println("Soy Isim Gir");
	 String soyIsim=scan.next(); 
	 System.out.println("Yas Gir");
	 String yas=scan.next();
	 System.out.println("Tel No Gir");
	 String telNo=scan.next();
	 System.out.println("Tc Gir");
	 String tc=scan.next();	
	 System.out.println("Kart No Giriniz");
	 String kartNo = scan.next();
	System.out.println("arac kiralamak istediginiz sehiri giriniz..");
	String alinacakSehir=scan.next();
	System.out.println("araci hangi gun alacaksınız?");
	String alinacakGun=scan.next();
	System.out.println("araci hangi saatte alacaksiniz?");
	double alisSaati=scan.nextDouble();
	System.out.println("araci hangi gun teslim edeceksiniz?");
	String teslimGunu=scan.next();
	System.out.println("araci hangi saatte teslim edeceksiniz?");
	double teslimSaati=scan.nextDouble();
   
     System.out.println();
       
     Musteri musteri=new Musteri(isim,soyIsim,yas,telNo,tc,kartNo, alinacakSehir, alinacakGun, alisSaati, teslimGunu, teslimSaati);
     musteriBilgileri.add(musteri);
     System.out.println(musteri);
	
	}
	private static void aracEkle(List<AracDepo> aracListesi) {
		/*
		 * String marka; (liste araclari --> opel toyota volvo) String model; (astra
		 * corolla s60) String yakitTipi; (diesel benzin) String vites; (manuel
		 * otomatik) double gunlukUcret; ( 100 120 150... liste dısı arac=300)
		 */
		
		AracDepo opel1=new AracDepo(++aracNo,"Opel","Astra","Diesel","Manuel",100);
		aracListesi.add(opel1);
		AracDepo opel2=new AracDepo(++aracNo,"Opel","Astra","Diesel","Otomatik",150);
		aracListesi.add(opel2);
		AracDepo opel3=new AracDepo(++aracNo,"Opel","Astra","Benzin","Manuel",200);
		aracListesi.add(opel3);
		AracDepo opel4=new AracDepo(++aracNo,"Opel","Astra","Benzin","Otomatik",250);
		aracListesi.add(opel4);
		
	//	System.out.print(aracListesi);
	
	}
	}



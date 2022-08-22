package aracKirlama;

import proje_AracKiralama.AracDepo;

import java.util.*;

import static aracKirlama.Yonetici.*;



public class Methodlar {

    static Map<String, Musteri> musteriBilgileri = new HashMap<>();

    static List<Rezervasyon> rezervasyonListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    static List<Double> sepet = new ArrayList<>();

    static int aracNo = 99;

    public static void anaMenu() {

        System.out.println("*********Lutfen yapmak istediginiz islemi seciniz**********  ");
        System.out.println("1-Müşteri Girişi" +
                "\n2-Yönetici Girişi\n0-Cikis");
        int sccim = scan.nextInt();

        switch (sccim) {
            case 1:
                musteriMenusu();
                break;
            case 2:
                yöneticiMenü();
                break;
            case 0:
                cikis1();
                break;
            default:
                System.out.println("yanlış bir sayı giridiniz");
                anaMenu();

        }

    }

    public static void musteriMenusu() {
        System.out.println("******H0Ş GELDİNİZ*****\nYapmak istediğniz İşlemi Seciniz\n" +
                "1-Araclari Listele\n2-Arac Kirala\n0-Cıkış");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
               araclariYazdir();
               aracKirala();
                break;
            case 2:
                aracKirala();
                break;
            case 0:
                break;
            default:
                System.out.println("yanlış giriş yapyınız");
                musteriMenusu();
        }

    }

    public static void aracKirala() {
        System.out.println("almak istediğniz şehri giriniz");
        String sehir=scan.next();
        System.out.println("Almak isteiğniz günü giriniz");
        Integer alGun = scan.nextInt();
        System.out.println("Almak istediğiniz saati giriniz");
        double alsaat = scan.nextDouble();
        System.out.println("tesli edilecek günü giriniz");
        Integer teslimGun = scan.nextInt();
        System.out.println("teslim edeceğiniz saati giriniz");
        double tesliSaat = scan.nextDouble();
        Rezervasyon r1=new Rezervasyon(sehir,alGun,teslimGun,alsaat,tesliSaat);
        rezervasyonListesi.add(r1);
        System.out.println("almak istediğniz aracın nosunu seciniz");
        int secim=scan.nextInt();
        if (aracBilgileri.containsKey(secim)){

            Double fiyat=(teslimGun-alGun)*aracBilgileri.get(secim).getGunlukUcret();
            sepet.add(fiyat);
        }


    }


}

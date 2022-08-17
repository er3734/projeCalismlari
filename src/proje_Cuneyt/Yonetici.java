package proje_Cuneyt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Yonetici {
    static Scanner scan=new Scanner(System.in);
    static String yanit="";

    static List<Depo>kanalListesi=new ArrayList<>();

    public static void giris() throws InterruptedException {
        String giris="\n"+"*******Tren Fm******\n" +
                "1-Kkullanici Girişi\n" +
                "2-Yonetici Girişi\n" +
                "3-Cıkış";
        System.out.println(giris);
        yanit=scan.next();

        switch (yanit){
            case "1":
                break;
            case "2":
                yonetici();
                break;
            case "3":
                cikis();
                break;


        }
    }

    private static void yonetici() throws InterruptedException {
        System.out.println("\n1-kanalekeleme\n" +
                "2-kanal listesi\n3-kanal sil\n 4-ana menu\n5-cıkış");

        yanit=scan.next();
        switch (yanit){
            case "1":
                kanalEkleme();
                devamMi();
                yonetici();
                break;
            case "2":
                kanallistesiGoster();
                System.out.println("menuyu yonlendiriyor");
                Thread.sleep(3000);
                yonetici();
                break;
            case "3":
                kanalSil();
                System.out.println("menuyu yonlendiriyor");
                Thread.sleep(3000);
                yonetici();
                break;
            case "4":
                giris();
                break;
            case "5":
                cikis();
                break;
        }
    }

    public static void cikis() {
        System.out.println("hayırlı gunler");
    }

    public static void kanalSil() {
        if (kanalListesi.isEmpty()){
            System.out.println("silinecek kalan yok");
        }else {
            System.out.println("kanallar listesi : "+kanalListesi);
            System.out.println("silmek istediğniz kanalı yazınız");
            scan.nextLine();
            String sil=scan.nextLine();
            for (Depo w:kanalListesi
                 ) {
                if (w.getName().equalsIgnoreCase(sil)){
                    kanalListesi.remove(sil);
                }
            }
        }
    }

    public static void kanallistesiGoster() {
        for (Depo w:kanalListesi
             ) {
            System.out.println(w);
        }
    }

    public static void kanalEkleme() {
        scan.nextLine();
        System.out.println("ekelemak istediğiniz kanalın ismini giriniz");
        String isim=scan.nextLine();
        System.out.println("ekelemekm istediğiniz kanalın frekansını gşrşnşz");
        String frekans=scan.next();

        Depo kanalEklemek=new Depo(isim,frekans);
        kanalListesi.add(kanalEklemek);
    }
    public  static boolean devamMi(){
        boolean devamMi=false;
        System.out.println("yeni kanal eklemek istermisiniz\n" +
                "EVET YADA HAYIR giriniz");
        yanit=scan.next();
        while (yanit.equalsIgnoreCase("EVET")){
            System.out.println("yeni kanal eklemek istermisiniz\n" +
                    "EVET YADA HAYIR giriniz");
            yanit=scan.next();
            kanalEkleme();
        }
        return devamMi;
    }
}

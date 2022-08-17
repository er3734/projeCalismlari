package proje_DepoYonetimi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Islemler {
    static Scanner scan=new Scanner(System.in);
    static  int id=1000;
    static Map<Integer,Urunler>urunler=new HashMap<>();

    public static void girisPanel() throws InterruptedException {
        System.out.println("****************İŞLEMLER****************\n" +
                "1-Ürün Tanımlama\n2-Miktar Guncellemesi\n3-Raf Guncellemesi\n4-Ürün Cıkışı" +
                "\n5-Ürünleri listele\n6-Cıkış");
        System.out.println("Yapmak istediğiniz işlemi seciniz");

        int secim=scan.nextInt();
        switch (secim){
            case 1:
                urunTanimla();
                girisPanel();
                break;
            case 2:
                miktarGuncelleme();
                girisPanel();
                break;
            case 3:
                rafGuncellemesi();
                girisPanel();
                break;
            case 4:
                urunCıkıs();
                girisPanel();
                break;
            case 5:
                urunListle();
                girisPanel();
                break;
            case 6:
                cikis1();
                break;
            default:
                System.out.println("Yanlış bir sayı girdiniz");
                break;
        }

    }

    public static void urunCıkıs() {
        System.out.println("Almak istediğiniz ürünün ıd numarasını giriniz");
        int id=scan.nextInt();
        if (urunler.keySet().contains(id)){
            System.out.println("Almak istediğiniz miktarı giriniz");
            int miktar=scan.nextInt();
            if (miktar>urunler.get(id).getMiktar()){
                System.out.println("Stoğumuzda bu kadar ürün bulunmmamktadır");
            }else {
                urunler.get(id).setMiktar(urunler.get(id).getMiktar()-miktar);
                System.out.println();
                System.out.println("Depoda kalan ürün\n"+urunler.get(id).getMiktar());
            }
        }else{
            System.out.println("Aradığınız ürün stoğumuzda yok");
        }
    }

    public static void rafGuncellemesi() {
        System.out.println("Raf numarasını güncellemek istediğiniz ürünün id numarasını giriniz");
        int guncelleneckId=scan.nextInt();
        if (urunler.keySet().contains(guncelleneckId)){
            System.out.println("Ürünün yeni raf numarsını giriniz");
            String yeniRafNo=scan.next();
            urunler.get(guncelleneckId).setRaf(yeniRafNo);
            System.out.println("Ürünün raf numarasını güncellediniz\n"+urunler.get(guncelleneckId).getRaf());
        }else {
            System.out.println("Aradığınız urun listede bulunmamaktadır");
        }
    }

    public static void miktarGuncelleme() throws InterruptedException {
        System.out.println("Miktarını guncellemek istediğiniz ürünün  id' sini giriniz");
        int guncellnecekId=scan.nextInt();
        if (urunler.keySet().contains(guncellnecekId)){
            System.out.println("Ekleceğiniz miktarı giriniz");
            int guncelMiktar= scan.nextInt();
            urunler.get(guncellnecekId).setMiktar(guncelMiktar+urunler.get(guncellnecekId).getMiktar());
            //yeni değeri eski değerinin üzerine ekliyoruz
            System.out.println("Ürün miktarını guncellendiniz\n"+urunler.get(guncellnecekId).getMiktar());
        }else {
            System.out.println("Aradığınız urun bulunamadı");
        }
        Thread.sleep(300);
    }



    public static void urunListle() throws InterruptedException {
        System.out.println("Ürün Listesi : \n"+urunler);
        Thread.sleep(3000);
    }

    public static void urunTanimla() throws InterruptedException {
        scan.nextLine();
        System.out.println("Ürün ismini giriniz");
        String urunIsmi=scan.nextLine();

        System.out.println("Üretici biligisini giriniz");
        String ureticiBilgi=scan.nextLine();

        System.out.println("Birimi giriniz");
        String urunBirimi=scan.nextLine();

        System.out.println("Ürün miktarını giriniz");
        int urunMiktar=scan.nextInt();

        scan.nextLine();
        System.out.println("Ürünün raf numarasını giriniz");
        String urunRaf=scan.next();

        Urunler urun=new Urunler(urunIsmi,ureticiBilgi,urunMiktar,urunBirimi,urunRaf);
        urunler.put(id,urun);
        System.out.println();
        System.out.println(id+" : " +urunler.get(id));
        id++;
        Thread.sleep(3000);
    }


    public static void cikis1() throws InterruptedException {
        System.out.println("****Sistemden cıktınız***");
        Thread.sleep(3000);
    }

}

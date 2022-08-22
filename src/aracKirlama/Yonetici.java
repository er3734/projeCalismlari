package aracKirlama;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static aracKirlama.Methodlar.anaMenu;

public class Yonetici {

    static Map<Integer, Araclar> aracBilgileri = new HashMap<>();
    
    static Scanner scan=new Scanner(System.in);
    static int aracNo=99;



    public static void main(String[] args) {


    }
    public static void yöneticiMenü() {
        Araclar yönetici = new Araclar();
        System.out.println("lutfen yönetici şifrenizi giriniz");
        int hak = 0;
        while (hak < 3) {
            int sifre = scan.nextInt();//try ctch atılabilir

            if (sifre == yönetici.getSifre()) {
                System.out.println("grişiniz onaylandı");
                yoneticiIslemleri();
                break;
            } else {
                System.out.println("yanlış bir şifre girdiniz");
            }
            hak++;
        }
        anaMenu();


    }

    public static void yoneticiIslemleri() {
        boolean devamMı = false;
        do {

            System.out.println("Yapmak istediğniz işlemi seciniz\n" +
                    "1-Arac ekleme\n2-Arac silme\n0-Cıkış");
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    aracEkleme();
                    break;
                case 2:
                    aracSil();
                    break;
                case 0:
                    araclariYazdir();
                    break;
                default:
                    System.out.println("yanlış bir şeyler girdiniz");
                    devamMı = true;
            }
        } while (devamMı);
    }

    public static void aracSil() {
        araclariYazdir();
        System.out.println(aracBilgileri);
        System.out.println("silmek istediğiniz aracın numarasını giriniz");
        Integer no = scan.nextInt();
        if (aracBilgileri.containsKey(no)) {
            aracBilgileri.remove(no);
            araclariYazdir();
        } else {
            System.out.println("Listemizde böyle bir araç yoktur");
        }
    }

    public static void aracEkleme() {

        araclariYazdir();

        System.out.println("eklemek istediğiniz aracın markasını giriniz");
        String marka = scan.next();
        System.out.println("eklemek istediğiniz aracın modelini giriniz");
        String model = scan.next();
        System.out.println("eklemek istediğiniz aracın yakıt tpipni giriniz");
        String yakit = scan.next();
        System.out.println("eklemek istediğiniz aracın vites türünü giriniz");
        String vites = scan.next();
        System.out.println("eklemek istediğiniz aracın günlük ücretini giriniz");
        double ucret = scan.nextDouble();
        Araclar arac = new Araclar(marka, model, yakit, vites, ucret);
        aracBilgileri.put(++aracNo, arac);
        araclariYazdir();

    }



    public static void araclariYazdir() {
        Araclar opel1 = new Araclar("Opel", "Astra", "Diesel", "Manuel", 100);
        aracBilgileri.put(++aracNo, opel1);
        Araclar opel2 = new Araclar("Opel", "Astra", "Diesel", "Manuel", 100);
        aracBilgileri.put(++aracNo, opel2);
        Araclar opel3 = new Araclar("Opel", "Astra", "Diesel", "Manuel", 100);
        aracBilgileri.put(++aracNo, opel3);
        Araclar opel4 = new Araclar("Opel", "Astra", "Diesel", "Manuel", 100);
        aracBilgileri.put(++aracNo, opel4);

        Set<Map.Entry<Integer, Araclar>> aracListesi = aracBilgileri.entrySet();

        for (Map.Entry<Integer, Araclar> w : aracListesi) {
            System.out.println(w);
        }
    }
    public static void cikis1() {
        System.out.println("Bizi tercih ettiğiniz için iyi gunler dileriz");
    }

}

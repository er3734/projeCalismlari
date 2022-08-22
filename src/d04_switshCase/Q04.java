package d04_switshCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi haftanin ilk gunu olarak aliniz..

        int gun=7;
        int artıkGun=gun%7;
        System.out.println(artıkGun);

        switch (artıkGun){
            case 0:
                System.out.println(gun+" gun sonra Pazartesi");
                break;
            case 1:
                System.out.println(gun +" gun sonra Salı");
                break;
            case 2:
                System.out.println(gun+" gun sonra Carşamba");
                break;
            case 3:
                System.out.println(gun+" gun sonra Perşembe");
                break;
            case 4:
                System.out.println(gun+" gun sonra Cuma");
                break;
            case 5:
                System.out.println(gun+" gun sonra Cumartesi");
                break;
            case 6:
                System.out.println(gun+" gun sonra Pazar");
                break;
            default:
                break;
        }
    }
}


package d03_while_DoWhile;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
        // Kullanicidan 2 sayi alaliniz.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplatan code create edinim.
        // 3, 3  sonuc = 27

        //2  3 = 2*2*2=8


        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        int s1=scan.nextInt();
        int s2= scan.nextInt();
        int c=1;

        while (s2>0){
            c*=s1;
            s2--;
        }
        System.out.println(c);

    }


}

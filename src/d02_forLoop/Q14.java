package d02_forLoop;

import java.util.Scanner;

public class Q14 {

    /*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

    public static void main(String[] args) {

        int x=5;
        for (int i = 1; i <=x ; i++) {
            for (int j = 1; j <=x-i ; j++) {
                System.out.print(" ");
            }
            for (int j = x-i; j <x ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       
         /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

        for (int i = 0; i <x ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
        
    }
}

package d02_forLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        System.out.println("lutfen 5 adet sayi giriniz");
        Scanner scan=new Scanner(System.in);
        ;
        int sum=0;

        for (int i = 1; i <6 ; i++) {
            System.out.println(i+". Sayıyı giriniz");
            int say= scan.nextInt();
            if (say>=5&&say<=10){
                continue;
            }else {
                sum+=say;
            }
        }
        System.out.println(sum);
    }

}

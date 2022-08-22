package d03_while_DoWhile;

public class Q11 {

    /*
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.

            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25


            Example 3:
            Input: 14
            Output: false

         */
    public static void main(String[] args) {

        int sayi=8;
        boolean tamKare=false;

        for (int i = 1; i <=sayi/2 ; i++) {
            if (i*i==sayi){
                tamKare=true;
                break;
            }else {
                tamKare=false;
            }
        }
        if (tamKare){
            System.out.println("sayınız tam karedir");
        }else {
            System.out.println("sayınız tan kare değildir");
        }



    }
}

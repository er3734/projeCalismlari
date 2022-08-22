package d02_forLoop;

public class Q15 {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <=i ; j++) {
                char a= (char) (j+65);
                System.out.print(a);
            }
            System.out.println();
        }
    }
}

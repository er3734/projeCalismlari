package d08_tryCatch;

public class S01 {

    public static void main(String[] args) {
        for (int i = 5; i >=-2 ; i--) {
            try {
                int b=10/i;
                System.out.println(b);
            } catch (ArithmeticException e) {
                System.out.println("0 a bolunmez"+ e);
            }
        }
    }
}

package d08_dataTime;

import java.time.LocalDate;
import java.time.Month;

public class Q03 {

    public static void main(String[] args) {

        /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */
        LocalDate date = null;
        try {
            date = LocalDate.of(2018, Month.FEBRUARY, 29);
            System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
        } catch (Exception e) {
            System.out.println("hata");
        }



            /*
            A. 2018 APRIL 29
            B. 2018 APRIL 30
            C. 2018 MAY 10
            D. Another date.
            E. The code does not compile.
            F. A runtime exception is thrown.
            */

    }
}

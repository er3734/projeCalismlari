package d06_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
    	// kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
        // String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
        // { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}


        String str = "Javacilar cook afilli";

        int count[] = new int[256];

        for (int i = 0; i < str.length(); i++)

            count[str.charAt(i)]++;

        System.out.println(Arrays.toString(count));

        char ch[] = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);

            int find = 0;

            for (int j = 0; j <= i; j++) {
                // If any matches found:Herhangi bir eşleşme bulunursa

                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.print(str.charAt(i) + " = " + count[str.charAt(i)]);
        }      

	      
	      
	      
	      
	      
	}
}

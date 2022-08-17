package mapSorular;

import java.util.HashMap;
import java.util.Map;

public class S01 {
    public static void main(String[] args) {
        String adlar[]={"erdi","hatice","ali"};
        String soyAdlar[]={"balta","balbay","can"};
        Map<String,String>adSoyad=new HashMap<>();
        for (int i = 0; i <adlar.length ; i++) {
            adSoyad.put(adlar[i],soyAdlar[i] );
        }
        System.out.println(adSoyad);
    }
}

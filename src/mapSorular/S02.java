package mapSorular;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {
        //bir cümlede ayı kelimeden kaç ane var  yanına map ile yazdır
        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String str=scan.nextLine();

        Map<String,Integer>kelimeSayisi= kelimeSay(str);
        System.out.println(kelimeSayisi);


    }

    private static Map<String, Integer> kelimeSay(String str) {
        Map<String,Integer>kelimeSayisi=new HashMap<>();

        String []arr=str.split(" ");

        for (int i = 0; i < arr.length ; i++) {
            if (kelimeSayisi.containsKey(arr[i])){
                kelimeSayisi.put(arr[i],kelimeSayisi.get(arr[i])+1 );
            }else {
                kelimeSayisi.put(arr[i],1 );
            }
        }
        return kelimeSayisi;

    }


}

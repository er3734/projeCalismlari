package d06_arrays;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {


        //multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        // ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        //input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

    	int arr1[][]={{10,20,30},{4},{6,7,20}}; //icine giriyoruz
    	int yeniarr[]=new int[arr1.length];
    	
    	for (int kat = 0; kat < arr1.length; kat++) {
    		for (int daire = 0; daire < arr1[kat].length; daire++) {
				yeniarr[kat]+=arr1[kat][daire];
			}
			
		}
    	
    	System.out.println(Arrays.toString(yeniarr));
    	

    }
}

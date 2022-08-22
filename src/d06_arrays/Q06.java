package d06_arrays;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
	
	/*    write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyükk ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	
	*/

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90,10001 };
        Arrays.sort(arr);
        System.out.println("min : "+arr[0] );
        System.out.println("max: "+ arr[arr.length-1]);
        for (int i = arr.length-1; i>=0; i--) {
            if (arr[i]!=arr[i-1]){
                System.out.println("max 2. eleman : "+arr[i-1]);
                break;
            }else {

            }
        }
    }

}

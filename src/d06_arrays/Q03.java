package d06_arrays;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {
        //bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6
    	int arr1[]={1,2,-3,4,-5,-6};

        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=-1*arr1[i];
        }

        System.out.println(Arrays.toString(arr1));

    }


}

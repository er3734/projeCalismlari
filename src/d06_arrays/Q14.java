package d06_arrays;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
		/*
		 * Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu
		 * alin.
		 * input : Congratulations
		 * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

		 */

		String str="Congratulations";
		String []arr=str.split("");
		String[] yArr=new String[str.length()];
		int x=0;

		for (int i = arr.length-1;  i >=0 ; i--) {
			if (arr[i].equals("o")||arr[i].equals("u")||arr[i].equals("a")){
				yArr[x]="i";
				x++;
			}else {
				yArr[x]=arr[i];
				x++;
			}



		}
		System.out.println(Arrays.toString(yArr));
		
		
	}

}

public class Interwiev {

    public static void main(String[] args) {
        //[Coding] Using the given array: 1, 2, 2, 3, 3, 3, 5, 7, 11, 15
        //In any programming language, write an algorithm to calculate the result of the given formula in picture attached.

        int [] arr={1, 2, 2, 3, 3, 3, 5, 7, 11, 15};
        double sum=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            sum+=Math.pow(arr[i],i)/factoriel(i);
        }
        System.out.println("sum = " + sum);
    }
    public static int factoriel(int x){
        if (x==0){
            return 1;
        }else{
        int fac =1;
        do {
            fac*=x;
            x--;
        }while (x>0);
        return fac;
    }
    }
}

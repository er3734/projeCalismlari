package d03_while_DoWhile;

import java.util.Scanner;

public class Q06 {
	static int bolum=0; // class levelda bir variable ilk deger otomatik 0 atanmis

	public static void main(String[] args) {
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
		//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Bolunen sayiyi giriniz : ");
        int bolunen=scan.nextInt();
        System.out.println("Bolen sayiyi giriniz : ");
        int bolen=scan.nextInt();
        
        System.out.println("sonuc : " +bol(bolunen,bolen));
	}
       public static int bol(int bolunen, int bolen) {
       while (bolunen>=bolen) {
	   bolunen-=bolen;
	   bolum++;
	   
}

	return bolum;
}
}



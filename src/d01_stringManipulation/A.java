package d01_stringManipulation;

public class A {
    public static void main(String[] args) {
        String numara = "$1800 Milyon";

        System.out.println("REPLACEaLL METODU>>>> " + numara.replaceAll("[a-zA-Z]", "")); //$1800
        System.out.println("REPLACEaLL METODU>>>> " + numara.replaceAll("[0-9]", "")); //$ Milyon
        System.out.println("----------");
    }
}

package hu.webler.cast;

public class Casting {

    public static void main(String[] args) {

        //pl egész szám (int) átalakítására lebegőpontos számmá (double)
        int intValue = 10;
        double doubleValue = (double) intValue;
        System.out.println("int érték: " + intValue);
        System.out.println("double érték: " + doubleValue);

        //pl lebegőpontosból egész számmá
        double pi = 3.14;
        int intValueOfPi = (int) pi;
        System.out.println("double int érték: " + pi);
        System.out.println("int pi érték: " + intValueOfPi);

        //pl karakter átalakítására egész számmá
        char letter = 'A';
        int intValueFromChar = (int) letter;
        System.out.println("Char érték: " + letter);
        System.out.println("Int értéke a char-nak: " + intValueFromChar);
    }
}

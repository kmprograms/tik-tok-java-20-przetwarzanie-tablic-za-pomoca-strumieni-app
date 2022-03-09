public class App1 {
    /*
        Przygotuj klasę do zarządzania przykładową tablicą elementów typu int.
        Elementy tablicy losowane są z przedziału <MIN_VALUE, MAX_VALUE>.
        Rozmiar tablicy losowany jest z przedziału <MIN_SIZE, MAX_SIZE>.
        Przygotuj funkcjonalności, które pozwalają wyznaczyć średnią arytmetyczną
        elementów w tablicy, elementy największy oraz najmniejszy w tablicy.
    */

    public static void main(String[] args) {
        final var MIN_SIZE = 5;
        final var MAX_SIZE = 10;
        final var MIN_VALUE = 100;
        final var MAX_VALUE = 200;

        var size = RandomManager.intValue(MIN_SIZE, MAX_SIZE);
        var arrayManager = new ArrayManager(size, MIN_VALUE, MAX_VALUE);

        System.out.println(arrayManager);
        System.out.printf("AVERAGE = %.2f%n", arrayManager.average());
        System.out.printf("MIN     = %d%n", arrayManager.min());
        System.out.printf("MAX     = %d%n", arrayManager.max());
    }
}

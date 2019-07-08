import javax.swing.*;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator1 = new Calculator();

        boolean isEven = calculator1.isEven(37);
        System.out.println("Czy liczba jest parzysta? " + isEven);

        boolean isOdd = calculator1.isOdd(23);
        System.out.println("Czy liczba jest nieparzysta? " + isOdd);

        double circleField = calculator1.circleField(3.5);
        System.out.println("Pole koła wynosi: " + circleField);

        int power = calculator1.power(11);
        System.out.println("Kwadrat liczby a to: " + power);
    }
}

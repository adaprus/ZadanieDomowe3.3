public class Calculator {

    boolean isEven(int a){

        boolean result = (a%2 == 0);
        return result;
    }

    boolean isOdd(int a){

        boolean result =! isEven(a);

        return result;
    }

    double circleField (double r){

        double result = r * r * 3.14;

        return result;
    }

    int power (int a){

        int result = a * a;

        return result;
    }




}

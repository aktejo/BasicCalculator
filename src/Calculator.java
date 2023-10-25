public class Calculator {

    public Calculator() {

    }

    public double add(double a, double b) {
        double sum;
        sum = a + b;
        return sum;
    }

    public double subtract(double a, double b) {
        double difference;
        difference = a - b;
        return difference;
    }

    public double multiply(double a, double b) {
        double product;
        product = a * b;
        return product;
    }

    public double divide(double a, double b) {
        double quotient;
        quotient = a / b;
        return quotient;
    }
    public double modulus(double a, double b) {
        double modresult;
        modresult = a % b;
        return modresult;
    }

    public int square(int a) {
        int squaredResult;
        squaredResult = a * a;
        return squaredResult;
    }

    public int cube(int a) {
        int cubedResult;
        cubedResult = a * a * a;
        return cubedResult;
    }

    public double power(double base, double exponent) {
        double result = base;
        for (int i = 1; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }

}

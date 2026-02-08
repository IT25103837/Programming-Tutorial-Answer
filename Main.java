public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        // (3*4 + 5*7)^2
        int exp1 = cal.square(
                        cal.add(
                            cal.multiply(3,4),
                            cal.multiply(5,7)
                        )
                    );

        // (4+7)^2 + (8+3)^2
        int exp2 = cal.square(cal.add(4,7))
                 + cal.square(cal.add(8,3));

        System.out.println("Expression 1 = " + exp1);
        System.out.println("Expression 2 = " + exp2);
    }
}

class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int square(int a){
        return a * a;
    }
}

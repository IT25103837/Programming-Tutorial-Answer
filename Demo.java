public class Demo {
    public static void main(String[] args) {

        EvenOddNumber obj = new EvenOddNumber();

        int num1 = 10;
        int num2 = 7;

        if(obj.findEvenOrOdd(num1)){
            System.out.println(num1 + " is Even");
        } else {
            System.out.println(num1 + " is Odd");
        }

        if(obj.findEvenOrOdd(num2)){
            System.out.println(num2 + " is Even");
        } else {
            System.out.println(num2 + " is Odd");
        }
    }
}

class EvenOddNumber {

    public boolean findEvenOrOdd(int i){
        if(i % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}

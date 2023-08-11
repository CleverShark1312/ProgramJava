/*

class Main {
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        Main obj = new Main();
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);
    }
}

*/


// Return Type Method


/*
class Main {
    public static int square(int num) {
        return num * num;
    }
    public static void main(String[] args) {
        int result;
        int result1;
        result = square(16);
        result1 = square(110);
        System.out.println("Square of 16 is: " + result);
        System.out.println("Square of 110 is: " + result1);
    }
}

*/

//Method parameters

/*
class Main {
    public void display1() {
        System.out.println("Method without parameter");
    }
    public void display2(int a) {
        System.out.println("Method with a single parameter: " + a);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.display1();
        obj.display2(24);
    }
}

*/

//Java Library Method
/*
public class Main {
    public static void main(String[] args) {

        // using the sqrt() method
        System.out.println("Square root of 4 is: " + Math.sqrt(4));
        System.out.println("Square root of 256 is: " + Math.sqrt(256));
        System.out.println("Square root of 625 is: " + Math.sqrt(625));
    }
}

*/

//Reusing methods in code
//Understanding classes and objects.

public class Main {
    private static int getSquare(int x){
        return x * x;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int result = getSquare(i);
            System.out.println("Square of " + i + " is: " + result);
        }
    }
}
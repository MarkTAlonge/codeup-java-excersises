import java.util.Scanner;

public class MethodsExercises {

    public static void Addition(int x, int y) {
        System.out.println(x + y);
    }

    public static void Subtraction(int x, int y) {
        System.out.println(x - y);
    }

    public static void Multiplication(int x, int y) {
        System.out.println(x * y);
    }

    public static void Division(int x, int y) {
        System.out.println(x / y);
    }

    public static void Modulus(int x, int y) {
        System.out.println(x % y);
    }

    public static void main(String[] args) {
        Addition(2, 5);
        Subtraction(12, 3);
        Multiplication(7, 8);
        Division(20, 4);
        Modulus(52, 57);
//        getInteger(1, 50);
    }

//
//    public static int getInteger(int min, int max) {
//    Scanner scanner = new Scanner(System.in);
//        System.out.println(min - max);
//        System.out.print("Enter a number between 1 and 50: ");
//        int userInput = getInteger(min, max);
//        if(userInput < 0 || userInput > 50);
//            return 0;
//    }
}



import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int myFavoriteNumber = 7;
        String question = "What is your favorite number?";


        System.out.println(question);
        System.out.println(myFavoriteNumber);

        String MyString = "3.14159";

        System.out.println(MyString);

        float myNumber = 3;
        System.out.println(myNumber);
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        int c = 5;
        System.out.println(++x);
        System.out.println(x);



        int a = 4;
        a += 5;

        int p = 3;
        int y = 4;
        p *= x;

        int e = 10;
        int r = 2;
        e /=  r;
        y -= y ;
    Scanner sc = new Scanner(System.in);

    int userInput = sc.nextInt();

    System.out.println("You entered the following: " + userInput);
}
}

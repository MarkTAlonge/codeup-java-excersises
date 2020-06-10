import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


//        int i = 5;
//        System.out.println(i);
//
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//
//
//        int j=2;
//        do{
//            System.out.println(j);
//            j++;
//        }while(j<=100);
//
//
//        int k=106;
//        do{
//            System.out.println(k -= 6);
//            k++;
//        }while(k > -5);
//
//        long l = 2;
//        do {
//            System.out.println(l);
//            l *= l;
//        } while(l < 1000000);
//
//        int m = 1;
//        do {
//            System.out.println(m);
//            m++;
//        } while(m <= 100);
//
//        for(int n = 1; n <= 100; n++) {
//            if (n %3 == 0 && n%5 ==0)
//                System.out.println("fizzBuzz");
//            if (n %3 == 0)
//            System.out.println("fizz");
//            if (n %5 == 0)
//            System.out.println("buzz");
//            else
//            System.out.println(n);
//            }
//
//        }

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What number would you like to go up to?");
//        int userInput1 = scanner.nextInt();
//        System.out.print("Here is your table");
//        System.out.println("number     | Squared     | Cubed");
//        System.out.println("-----      | -------     | ------");
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.print("would you like to continue y/n?");
//        int maxRow = y;    //maximum row length is 4
//        int maxCol = y;
//        int max_row = y;    //maximum row length is 1
//        int max_col = y;    //maximum column length is 2
//        for (int x = y; x < maxRow; x++) {
//            for (int y = 1; y < maxCol; y++) {
//                    System.out.printf("%d          |  %d               |  %d%n", y, y*y, y*y*y);
//                    continue;
//                }
//            }
//        }
//    }


                Scanner sc = new Scanner(System.in);


                String choice = "y";
                while (choice.equalsIgnoreCase("y"))
                {

                    System.out.print("Enter Numeric Grade:\t\t");
                    double score = sc.nextDouble();


                    char userGrade = 'F';
                    if(score >= 90)
                        userGrade = 'A';
                    else if(score >= 80)
                        userGrade = 'B';
                    else if (score >= 70)
                        userGrade = 'C';
                    else if (score >= 60)
                        userGrade = 'D';



                    String message = "Equivalent Letter Grade:\t" + userGrade;
                    System.out.println(message);


                    System.out.print("\nContinue? (y/n):\t\t");
                    choice = sc.next();
                    System.out.println();
                }
            }
        }


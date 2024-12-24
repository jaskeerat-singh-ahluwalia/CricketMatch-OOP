import java.util.Scanner;

/**
 * @author jaskeeratsingh
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Cricket Format:");
        System.out.println("1. ODI");
        System.out.println("2. T20");
        System.out.println("3. Test");
        int choice = scanner.nextInt();

        if (choice > 0 && choice < 4){
            System.out.println("Enter the Current Score:");
            int score = scanner.nextInt();
            System.out.println("Enter the Current Over:");
            int over = scanner.nextInt();
            System.out.println("Enter the Target Score");
            int targetScore =  scanner.nextInt();

            System.out.println("Requirements:");
            switch (choice) {
                case 1:
                    ODIMatch odi = new ODIMatch(score,over,targetScore);
                    float reqRunRate = odi.calculateRunrate();
                    int balls = odi.calculateBalls();
                    odi.display(reqRunRate,balls);
                    break;
                case 2:
                    T20Match t20 = new T20Match(score,over,targetScore);
                    reqRunRate = t20.calculateRunrate();
                    balls = t20.calculateBalls();
                    t20.display(reqRunRate,balls);
                    break;
                case 3:
                    TestMatch test = new TestMatch(score,over,targetScore);
                    reqRunRate = test.calculateRunrate();
                    balls = test.calculateBalls();
                    test.display(reqRunRate,balls);
                    break;
            }
        }
        else{
            System.out.println("Invalid Format type");
        }
        scanner.close();





    }
}
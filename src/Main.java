import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       System.out.print("Please input your age: ");
       Scanner scanner = new Scanner(System.in);
       int age = scanner.nextInt();



        System.out.print("Please enter your username: ");
        Scanner scanner1 = new Scanner(System.in);
        String username = scanner1.nextLine();

        System.out.println("Hello, " + username);
        System.out.println("How are you today, " + username + "?");
        System.out.println("Have a nice weekend, " + username);
        System.out.println("You are: " + age + "years old");
        System.out.println("Your age in 5 years is: " + (age + 5));

        if (age <= 35) {
            System.out.println("Hello");
        } else {
            System.out.println("Good evening");
        }
        if (25 % 5 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }


    }
}

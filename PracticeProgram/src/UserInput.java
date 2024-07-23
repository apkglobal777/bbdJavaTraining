import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //print your name from user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String myName = scanner.nextLine();
        System.out.println("Enter your age: ");
        int myAge = scanner.nextInt();
        System.out.println("My first salary was: ");
        double myFirstSalary = scanner.nextDouble();

        System.out.println("My name is : " + myName + " and my age is : "+ myAge
                +" my first job salary was : "+ myFirstSalary);

    }
}

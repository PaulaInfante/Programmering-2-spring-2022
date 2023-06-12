import java.util.Scanner;

public class WeightOnMoon {
    public static void main(String[] args) {

        double MoonGravity = 0.165;         // The moon's approximately gravity compared to earth's

        double Weight = 85.0;               //my weight

        double WeightOnMoon = MoonGravity * Weight; // WeightOnMoon to multiply MoonGravity and Weight.

        System.out.println(WeightOnMoon + "kg"); // added kg to pop up with WeightOnMoon

        // Get user input

        Scanner scan = new Scanner(System.in); // gets input from user, from the console

        System.out.println("Enter weight:");
        double userInput = scan.nextDouble(); // reads and saves users input
        double UsersWeightOnMoon = MoonGravity * userInput;

        System.out.println("Your weight on the Moon is:");
        System.out.println(UsersWeightOnMoon + "kg");

    }
}

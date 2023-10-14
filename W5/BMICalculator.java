import java.util.Scanner;

public class BMICalculator {

    public static String calculateBMI(double weight, double height) {
        String res = "";
        if (weight <= 0 || weight > 150 || height <= 0 || height > 3){
            return "Invalid value";
        }

        // Calculate BMI
        double bmi = weight / (height * height);

        // Interpret the BMI
        if (bmi < 18.5) {
            res = "Thinness";
        } else if (bmi >= 18.5 && bmi < 25) {
            res = "Normal";
        } else if (bmi >= 25.0 && bmi < 30) {
            res = "Overweight";
        } else if (bmi >= 30.0 && bmi < 35) {
            res = "Obese Class I";
        } else if (bmi >= 35.0 && bmi < 40) {
            res = "Obese Class II";
        } else if (bmi >= 40){
            res = "Obese Class III";
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        // Input weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        weight = scanner.nextDouble();

        // Input height in meters
        System.out.print("Enter your height in meters: ");
        height = scanner.nextDouble();

        // Print result
        System.out.println("Your BMI is " + calculateBMI(weight, height));

        scanner.close();
    }
}
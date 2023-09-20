#include <iostream>
using namespace std;

int main() {
    double weight, height, bmi;

    // Input weight in kilograms
    cout << "Enter your weight in kilograms: ";
    cin >> weight;

    // Input height in meters
    cout << "Enter your height in meters: ";
    cin >> height;

    if (weight < 1 || weight > 150 || height < 0 || height > 3){
        cout << "Invalid value";
        return 0;
    }

    // Calculate BMI
    bmi = weight / (height * height);

    // Display the calculated BMI
    cout << "Your BMI is: " << bmi << endl;

    // Interpret the BMI with more obesity categories
    if (bmi < 18.5) {
        cout << "Thinness" << endl;
    } else if (bmi >= 18.5 && bmi < 25) {
        cout << "Normal" << endl;
    } else if (bmi >= 25.0 && bmi < 30) {
        cout << "Overweight." << endl;
    } else if (bmi >= 30.0 && bmi < 35) {
        cout << "Obesity Class I" << endl;
    } else if (bmi >= 35.0 && bmi < 40) {
        cout << "Obesity Class III" << endl;
    } else {
        cout << "Obesity Class II" << endl;
    }

    return 0;
}

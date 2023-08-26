package week3;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double windChillIndex;
        double temperature;
        double windSpeed;
        boolean isTemperatureValid;
        boolean isWindSpeedValid;

        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
        temperature = input.nextDouble();
        if(temperature<41&&temperature>-58)
            isTemperatureValid = true;
        else
            isTemperatureValid = false;
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        windSpeed = input.nextDouble();
        if(windSpeed>=2)
            isWindSpeedValid = true;
        else
            isWindSpeedValid = false;
        if(isTemperatureValid&&isWindSpeedValid) {
            windChillIndex = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
            System.out.println("The wind chill index is " + windChillIndex);
        }
        else if (!(isTemperatureValid||isWindSpeedValid)){
            System.out.println("Both parameters are invalid");
        }
        else if (!(isTemperatureValid)&&isWindSpeedValid) {
            System.out.println("The temperature invalid");
        }
        else
            System.out.println("The wind invalid");
    }
}

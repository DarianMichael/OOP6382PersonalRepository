package ec.edu.espe.temperatureconverter.utils;

import ec.edu.espe.temperatureconverter.model.Celsius;
import ec.edu.espe.temperatureconverter.model.Farenheit;
import java.util.Scanner;

public class KeyboardInput {

    private final Celsius celsius;
    private final Farenheit farenheit;
    private final TemperatureConverter temperatureConverter;
    private static final Scanner keyboard = new Scanner(System.in);

    public KeyboardInput() {
        celsius = new Celsius();
        farenheit = new Farenheit();
        temperatureConverter = new TemperatureConverter();
    }

    public double enterData() {
        double number = 0.0;
        try {
            System.out.print("Enter the temperature you want to convert: ");
            number = keyboard.nextInt();
            System.out.print("The data has been entered correctly\n");
        } catch (Exception ex) {
            System.out.println("You must enter a number ");
            keyboard.nextLine();
            return enterData();
        }
        return number;
    }

    public void menu() {
        int option = 0;
        do {
            try {
                System.out.println("     ********MENU********      ");
                System.out.println("   CHOOSE THE DESIRED OPTION  ");
                System.out.println();
                System.out.println("1.-Convert from celsius to fahrenheit");
                System.out.println("2.-Convert from fahrenheit to celsius");
                System.out.println("3.-Exit");
                double result;
                option = keyboard.nextInt();

                switch (option) {
                    case 1:
                        celsius.setGradeCelsius(enterData());
                        result = temperatureConverter.converterCentigradesToFarenheit(celsius);
                        System.out.println(result + "° Farenheit");
                        System.out.println();
                        break;

                    case 2:
                        farenheit.setGradeFarenheit(enterData());
                        result = temperatureConverter.converterFarenheitToCentigrades(farenheit);
                        System.out.println(result + "° Celsius");
                        System.out.println();
                        break;

                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong choice");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error !!! You must choose the option with numbers");
                keyboard.nextLine();
            }

        } while (option != 3);
    }
}

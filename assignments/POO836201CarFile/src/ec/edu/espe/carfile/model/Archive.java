
package ec.edu.espe.carfile.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class Archive {
    
    File carFile;

    public void createFile() throws IOException {
        carFile = new File("carFile.txt");
        if (!carFile.exists()) {
            carFile.createNewFile();
        } 
        introduceData();
    }

    public void introduceData() throws IOException {
        Scanner dataEntry = new Scanner(System.in);

        System.out.print("Enter the car brand: ");
        String brand= dataEntry.nextLine();
  
        System.out.print("Enter the car model: ");
        String model= dataEntry.nextLine();
        
        System.out.print("Enter the car colour: ");
        String colour= dataEntry.nextLine();
        
        System.out.print("Enter the version of the car: STANDARD, SEMIFULL or FULL: ");
        String version = dataEntry.nextLine();
        System.out.println("Version: " + version);
        try{
            Version versionEum = Version.valueOf(version);
        }catch(IllegalArgumentException e){
            throw new RuntimeException("Invalid value for my enum : " + version);
        }
        
        System.out.print("Enter the cubic capacity of the car: ");
        int displacement= dataEntry.nextInt();
        while (displacement <= 0) {
            System.out.println("Incorrect data cannot be less than zero or zero");
            System.out.print("Enter the cubic capacity of the car again: ");
            displacement = dataEntry.nextInt();
        }       
  
        System.out.print("Enter the price of the car: ");
        int price = dataEntry.nextInt();
        while (price <= 0) {
            System.out.println("Incorrect data cannot be less than zero or zero");
            System.out.print("Enter the price of the car again: ");
            price = dataEntry.nextInt();
        }

        Car car = new Car(brand, model, colour, displacement,Version.valueOf(version), price);

        System.out.println("\nData were recorded");

        System.out.println("\n" + car.toString());

        try (FileWriter toWriter = new FileWriter(carFile, true);
                PrintWriter toWriterLine = new PrintWriter(toWriter)) {

            toWriterLine.print(" , " + brand);
            toWriterLine.print(" , " + model);
            toWriterLine.print(" , " + colour);
            toWriterLine.print(" , " + displacement);
            toWriterLine.print(" , " + Version.valueOf(version));
            toWriterLine.print(" , " + price);
            toWriterLine.print("\n");

        }

    }

    public void createBinaryData() throws IOException {
        Car car = new Car("Kia", "Picanto", "Azul", 1200, Version.FULL, 1700);
        FileOutputStream registryData = null;
        try {
            registryData = new FileOutputStream("carFileBinary.txt");
            ObjectOutputStream writeToFileBinary = new ObjectOutputStream(registryData);
            writeToFileBinary.writeObject(car);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}

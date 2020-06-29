/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.librarymanagersystem.controller;

import ec.edu.espe.librarymanagersystem.model.Book;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DARIAN
 */
public class KeyboardInput {

    private static final Scanner dataEntry = new Scanner(System.in);

    public void introduceData() throws IOException {

        System.out.print("Enter the title of the book: ");
        String title = dataEntry.nextLine();
        while (isNumeric(title)) {
            System.out.println("Numbers are not allowed");
            System.out.println("Enter the title of the book : ");
            title = dataEntry.nextLine();
        }

        System.out.print("Enter the author of the book: ");
        String author = dataEntry.nextLine();
        while (isNumeric(author)) {
            System.out.println("Numbers are not allowed");
            System.out.println("Enter the author of the book again : ");
            author = dataEntry.nextLine();
        }

        System.out.print("Enter the editorial of the book: ");
        String editorial = dataEntry.nextLine();
        while (isNumeric(editorial)) {
            System.out.println("Numbers are not allowed");
            System.out.println("Enter the editorial of the book again: ");
            editorial = dataEntry.nextLine();
        }

        System.out.print("Enter the year of publication: ");
        int yearOfPublication = dataEntry.nextInt();
        while (yearOfPublication <= 0) {
            System.out.println("Incorrect data cannot be less than zero or zero");
            System.out.print("Enter nter the year of publication again: ");
            yearOfPublication = dataEntry.nextInt();
        }
        
        Book book = new Book(title, author, editorial, yearOfPublication);
    }

    private static boolean isNumeric(String chain) {
        try {
            Integer.parseInt(chain);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    //Book book = new Book(title, author, editorial, yearOfPublication);
    List<Book> books = new ArrayList<>();
    List<String> listStrings = new ArrayList<>();

    for(Book book : books{
        listStrings.add(book.toString());
    
    } 
}


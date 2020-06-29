/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.librarymanagersystem.model;

/**
 *
 * @author DARIAN
 */
public class Book {
    
    private String title;
    private String author;
    private String editorial;
    private int yearOfPublication;

    public Book(String title, String author, String editorial, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    
    

    @Override
    public String toString() {
        return title + "," + author + "," + editorial + "," + yearOfPublication ;
    }
    
    
}

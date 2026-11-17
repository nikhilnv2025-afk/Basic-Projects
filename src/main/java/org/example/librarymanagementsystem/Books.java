package org.example.librarymanagementsystem;


import jakarta.persistence.*;

@Entity
@Table(name="Books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String bookName;
    String bookGenre;
    Double bookPrice;
    String author;

    public Books(){}

    public Books(Long id,
    String bookName,
    String bookGenre,
    Double bookPrice,
    String author){
        this.id = id;
        this.bookName = bookName;
        this.bookGenre = bookGenre;
        this.bookPrice = bookPrice;
        this.author = author;


    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
       this.author = author;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public void setBookName(String book_Name) {
       this.bookName = book_Name;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setId(Long id) {
        this.id = id;
    }
    // without getter and setter data cannot be retrieved

}

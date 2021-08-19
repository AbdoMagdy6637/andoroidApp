package com.example.ecommerceapp;

import android.graphics.drawable.Drawable;
import android.widget.Button;

public class Book {
    int imgURL;
    String title;
    String author ;
    Button btn;
    public Book(int imgURL, String title, String author, Button btn) {
        this.imgURL = imgURL;
        this.title = title;
        this.author = author;
        this.btn = btn;
    }

    public int getImgURL() {
        return imgURL;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public void setImgURL(int imgURL) {
        this.imgURL = imgURL;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

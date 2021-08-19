package com.example.ecommerceapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.BookViewHolder> {
    private ArrayList<Book> books = new ArrayList<>();
    private Context context;

    public Adapter(Context context, ArrayList<Book> arrayBook) {
        this.books = arrayBook;
        this.context = context;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.book, null, false);
        BookViewHolder bookViewHolder = new BookViewHolder(v);
        return bookViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final BookViewHolder holder, int position) {
        Book book = books.get(position);
        holder.tv_title.setText(book.getTitle());
        holder.tv_author.setText(book.getAuthor());
        holder.iv_img.setImageResource(book.getImgURL());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class BookViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_img;
        TextView tv_title, tv_author;
        Button btn_Fav;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_img = itemView.findViewById(R.id.book_imgbook);
            tv_title = itemView.findViewById(R.id.book_titlebook);
            tv_author = itemView.findViewById(R.id.book_authorbook);
            btn_Fav = itemView.findViewById(R.id.book_addToFav);
    }
}}
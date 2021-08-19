package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class ViewBooks extends AppCompatActivity {
    RecyclerView recyclerView;
    Button btn_Favourite;
    ArrayList<Book> arrayBook = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_books);
        btn_Favourite = findViewById(R.id.book_addToFav);
        recyclerView = findViewById(R.id.main_recycle);
        arrayBook.add(new Book (R.drawable.firstbook, "Inside Out & Back Again\n\n19$", "For all the ten years of her life, Ha has only known Saigon: the thrills of the markets, the joy of its traditions.",btn_Favourite));
        arrayBook.add(new Book (R.drawable.secondbook, "Alexander Hamilton\n\n4$", "From National Book Award winner Ron Chernow, a landmark biography of Alexander Hamilton, the Founding Father who galvanized, inspired, scandalized.",btn_Favourite));
        arrayBook.add(new Book (R.drawable.thirdbook, "Jaws\n\n9$", "Here is the classic suspense novel of shark versus man that was made into the blockbuster Steven Spielberg movie",btn_Favourite));
        arrayBook.add(new Book (R.drawable.frouthbook, "The Shipping News\n\n99$", "Quoyle is a hapless, hopeless hack journalist living and working in New York. When his no-good wife is killed in a spectacular road accident, Quoyle heads for the land of his forefathers",btn_Favourite));
        arrayBook.add(new Book (R.drawable.fifthbook, "A Game of Thrones\n\n29$", "A Game of Thrones is the first novel in A Song of Ice and Fire, a series of fantasy novels by the American author George R. R. Martin.",btn_Favourite));
        final Adapter adapter = new Adapter(getBaseContext(),arrayBook);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
package com.hphays.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.hphays.todoapp.R.id.etEditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
    }

    // ActivityTwo.java
    public void onSubmit(View v) {
        // closes the activity and returns to first screen
        this.finish();

    }

    public void onEditItem(View view) {
        onSubmit(view);
    }
}


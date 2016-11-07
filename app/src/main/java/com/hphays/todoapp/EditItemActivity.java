package com.hphays.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.hphays.todoapp.R.id.etEditText;

public class EditItemActivity extends AppCompatActivity {

    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        setTitle("Edit Activity");
        text = (EditText) findViewById(R.id.editText);
        text.setText(getIntent().getStringExtra("text"));
        text.setSelection(text.getText().length());
    }

    // ActivityTwo.java
    public void onSubmit(View v) {
        // closes the activity and returns to first screen
        launchMainView(text.getText().toString(), getIntent().getIntExtra("position", 0));
        this.finish();
    }


    public void launchMainView(String text, int position) {
        // first parameter is the context, second is the class of the activity to launch
        Intent i = new Intent();
        i.putExtra("text", text);
        i.putExtra("position", position);



        setResult(RESULT_OK, i); // brings up the main activity
    }
    public void onEditItem(View view) {
        onSubmit(view);
    }
}


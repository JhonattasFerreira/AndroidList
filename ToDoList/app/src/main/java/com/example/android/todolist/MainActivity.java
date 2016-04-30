package com.example.android.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> tarefas = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void adicionar(View view){
        EditText textField = (EditText) findViewById(R.id.edit_text_field);
        String textFieldContent = textField.getText().toString();
        if (!textFieldContent.isEmpty()){
            tarefas.add(textFieldContent);
        }
        textField.getText().clear();
        display();
    }

    public void display(){
        TextView things = (TextView) findViewById(R.id.things_field);

        String list = "";
        for (String x : tarefas ) {
            list = list + "\n" + x + "\n";
        }

        things.setText(list);
    }

}

package com.example.android.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> tarefas = new ArrayList();
    int number = 0;

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
            display();
        }
        textField.getText().clear();

    }

    public void display(){

        TextView things = (TextView) findViewById(R.id.things_field);
        String list = "";

        for (String x : tarefas ) {
            list = list + x + "\n";
        }

        things.setText(list);
    }

    public void displayNumber(){
        TextView numberTextView = (TextView) findViewById(R.id.number_text_view);
        numberTextView.setText("" + number);
    }

    public void decrement(View view){
        if (number > 1){
            number = number - 1;
            displayNumber();
        }

    }

    public void increment(View view){
        if (number < tarefas.size()){
            number = number + 1;
            displayNumber();
        }
    }

    public void deletar(View view){
        if(number != 0){
            tarefas.remove((number - 1));
            number = 0;
            display();
            displayNumber();
        }

    }

}

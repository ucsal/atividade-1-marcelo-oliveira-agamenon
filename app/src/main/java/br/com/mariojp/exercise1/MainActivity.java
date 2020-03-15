package br.com.mariojp.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button(View view) {
        EditText txt = findViewById(R.id.editText2);
        TextView tv = findViewById(R.id.textView);
        tv.setText("Olá " + txt.getText().toString());
    }

}

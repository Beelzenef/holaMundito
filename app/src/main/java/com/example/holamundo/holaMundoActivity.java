package com.example.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
        Mi primera aplicación de Android :D
        @author Elena G (Beelzenef)
        @version 1.0
        @see android.app.Activity
 */
public class holaMundoActivity extends AppCompatActivity {

    private TextView txtV_Msg;

    @Override
    // Método onCreate para nuestra primera Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);

        txtV_Msg = (TextView)findViewById(R.id.txtV_Msg);
        txtV_Msg.setText(R.string.bye_msg);
    }
}

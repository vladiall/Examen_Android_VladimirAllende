package com.example.examen_android_vladimirallende;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class Objetos extends MainActivity {
    private EditText user, pass;
    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.etuser);
        pass = (EditText) findViewById(R.id.etcontra);

        String contrasena = null;
        String usuario = null;
        switch (usuario) {
            case "Vladi":


                if (usuario.equals(user) && contrasena.equals(pass)) {
                  //  Intent i = new Intent(getBaseContext() );

                  //  startActivity(i);
                }

                break;
            case "":

                if (usuario.equals("") && contrasena.equals("")) {


                }
                break;
            default:

                if (usuario.equals("") && contrasena.equals("")) {


                }

                break;

        }
    }
}

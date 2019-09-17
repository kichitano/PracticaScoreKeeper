package com.example.practicacalificada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    FloatingActionButton ftb1mas;
    FloatingActionButton ftb2mas;
    FloatingActionButton ftb1men;
    FloatingActionButton ftb2men;
    Button btnGanador;
    Button btnReset;
    TextView txtPuntajeEqp1;
    TextView txtPuntajeEqp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ftb1mas = findViewById(R.id.eqp1mas);
        ftb2mas = findViewById(R.id.eqp2mas);
        ftb1men = findViewById(R.id.eqp1men);
        ftb2men = findViewById(R.id.eqp2men);
        txtPuntajeEqp1 = findViewById(R.id.txtPuntajeEqp1);
        txtPuntajeEqp2 = findViewById(R.id.txtPuntajeEqp2);
        btnGanador = findViewById(R.id.btnGanador);
        btnReset = findViewById(R.id.btnReset);



        ftb1mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(txtPuntajeEqp1.getText().toString());
                val++;
                txtPuntajeEqp1.setText(String.valueOf(val));
            }
        });

        ftb2mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(txtPuntajeEqp2.getText().toString());
                val++;
                txtPuntajeEqp2.setText(String.valueOf(val));
            }
        });

        ftb1men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(txtPuntajeEqp1.getText().toString());
                if (val>0)
                val--;
                txtPuntajeEqp1.setText(String.valueOf(val));
            }
        });

        ftb2men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(txtPuntajeEqp2.getText().toString());
                if (val>0)
                val--;
                txtPuntajeEqp2.setText(String.valueOf(val));
            }
        });

        btnGanador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mensaje = "EL GANADOR ES ";
                int val1 = Integer.parseInt(txtPuntajeEqp1.getText().toString());
                int val2 = Integer.parseInt(txtPuntajeEqp2.getText().toString());


                if(val1 > val2){
                    mensaje = mensaje + "EQUIPO 1.";
                }else if(val2 > val1){
                    mensaje = mensaje + "EQUIPO 2.";
                }
                if(val1 == val2){
                    mensaje = "AMBOS EQUIPOS ESTAN EMPATADOS.";
                }
                Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPuntajeEqp1.setText("0");
                txtPuntajeEqp2.setText("0");
            }
        });

    }



}

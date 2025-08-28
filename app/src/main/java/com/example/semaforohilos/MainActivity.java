package com.example.semaforohilos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnIniciar;
    ImageView imgLuzRojo;
    ImageView imgLuzAma;
    ImageView imgLuzVer;

    //semaforo 2
    ImageView imgLuzRojo2;
    ImageView imgLuzAma2;
    ImageView imgLuzVer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = findViewById(R.id.btnIniciar);
        imgLuzRojo = findViewById(R.id.imgLuzRojo);
        imgLuzAma = findViewById(R.id.imgLuzAma);
        imgLuzVer = findViewById(R.id.imgLuzVer);

        //Para el segundo semaforo
        imgLuzRojo2 = findViewById(R.id.imgLuzRojo2);
        imgLuzAma2 = findViewById(R.id.imgLuzAma2);
        imgLuzVer2 = findViewById(R.id.imgLuzVer2);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    imgLuzRojo.setImageResource(R.drawable.luz_roja);
                                    imgLuzAma.setImageResource(R.drawable.luz_off);
                                    imgLuzVer.setImageResource(R.drawable.luz_off);
                                }
                            });
                            try {
                                Thread.sleep(5000);
                            }
                            catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    imgLuzAma.setImageResource(R.drawable.luz_amarilla);
                                    imgLuzRojo.setImageResource(R.drawable.luz_off);
                                    imgLuzVer.setImageResource(R.drawable.luz_off);
                                }
                            });
                            try {
                                Thread.sleep(5000);
                            }
                            catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    imgLuzVer.setImageResource(R.drawable.luz_verde);
                                    imgLuzRojo.setImageResource(R.drawable.luz_off);
                                    imgLuzAma.setImageResource(R.drawable.luz_off);
                                }
                            });
                            try {
                                Thread.sleep(5000);
                            }
                            catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    imgLuzAma.setImageResource(R.drawable.luz_amarilla);
                                    imgLuzRojo.setImageResource(R.drawable.luz_off);
                                    imgLuzVer.setImageResource(R.drawable.luz_off);
                                }
                            });
                            try {
                                Thread.sleep(5000);
                            }
                            catch (InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                    }
                });
                thread.start();

                //Semaforo 2-----------------------
                Thread thread2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    imgLuzRojo2.setImageResource(R.drawable.luz_off);
                                    imgLuzAma2.setImageResource(R.drawable.luz_off);
                                    imgLuzVer2.setImageResource(R.drawable.luz_verde);
                                }
                            });
                            try {
                                Thread.sleep(5000);
                            }
                            catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    imgLuzAma2.setImageResource(R.drawable.luz_amarilla);
                                    imgLuzRojo2.setImageResource(R.drawable.luz_off);
                                    imgLuzVer2.setImageResource(R.drawable.luz_off);
                                }
                            });
                            try {
                                Thread.sleep(5000);
                            }
                            catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    imgLuzVer2.setImageResource(R.drawable.luz_off);
                                    imgLuzRojo2.setImageResource(R.drawable.luz_roja);
                                    imgLuzAma2.setImageResource(R.drawable.luz_off);
                                }
                            });
                            try {
                                Thread.sleep(5000);
                            }
                            catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    imgLuzAma2.setImageResource(R.drawable.luz_amarilla);
                                    imgLuzRojo2.setImageResource(R.drawable.luz_off);
                                    imgLuzVer2.setImageResource(R.drawable.luz_off);
                                }
                            });
                            try {
                                Thread.sleep(5000);
                            }
                            catch (InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                    }
                });
                thread2.start();
            }
        });

    }
}
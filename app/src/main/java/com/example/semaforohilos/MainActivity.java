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
    ImageView imgLuz;
    ImageView imgLuz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = findViewById(R.id.btnIniciar);
        imgLuz = findViewById(R.id.imgLuz);
        imgLuz2 = findViewById(R.id.imgLuz2);

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
                                    imgLuz.setImageResource(R.drawable.luz_roja);
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
                                    imgLuz.setImageResource(R.drawable.luz_amarilla);
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
                                    imgLuz.setImageResource(R.drawable.luz_verde);
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

                // Segundo Semaforo
                Thread thread2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    imgLuz2.setImageResource(R.drawable.luz_roja);
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
                                    imgLuz2.setImageResource(R.drawable.luz_off);
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
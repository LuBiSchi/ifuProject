package com.ifu;

/**
 * Created by Adribiolchi on 12/08/13.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
    //Timer para o SplashScren//
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            //Mostrando tela inicial com um temporizador. Isso será útil quando você
            // Quero mostrar caso o seu logotipo app / empresa
            //

            @Override
            public void run() {
                // Este método será executado sabe quando o cronômetro é longo
                // Inicia sua atividade principal aplicativo
                Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(i);

                //Fecha aplicação *-*
                finish();

            }
        }, SPLASH_TIME_OUT);
    }


}

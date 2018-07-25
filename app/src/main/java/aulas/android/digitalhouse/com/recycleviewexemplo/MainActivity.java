package aulas.android.digitalhouse.com.recycleviewexemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/*
* Classe que ira Mostrar o fragment da Recycle View */

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



// Se o bundle (saveInstanceState) estiver nullo, deverá criar o fragment - Blank Fragment


        if (savedInstanceState == null){

            getSupportFragmentManager().beginTransaction().replace((R.id.fragment_container),new BlankFragment()).commit();

        }

    }
}

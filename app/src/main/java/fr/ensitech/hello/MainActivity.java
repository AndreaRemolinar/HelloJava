package fr.ensitech.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.this.getClass().getSimpleName();
    private EditText editTextNom, editTextPrenom;
    private Button buttonSuivant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNom = findViewById(R.id.editTextNom);
        editTextPrenom = findViewById(R.id.editTextPrenom);
        buttonSuivant = findViewById(R.id.btnSuivant);

        buttonSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextNom.getText().toString().trim().isEmpty() || editTextPrenom.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity.this, "Tous les champs sont obligatoires", Toast.LENGTH_LONG).show();
                    return;
                }
                Log.i(TAG, "Nom = " + editTextNom.getText().toString() +"Prenom = "+ editTextPrenom.getText().toString());
                Intent intent = new Intent(MainActivity.this, SecondeActivity.class);
                startActivity(intent);
            }
        });
    }
}
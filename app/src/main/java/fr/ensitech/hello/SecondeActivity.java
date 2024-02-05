package fr.ensitech.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondeActivity extends AppCompatActivity {
    private final String TAG = SecondeActivity.this.getClass().getSimpleName();
    private Button buttonPrecedent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);
        buttonPrecedent = findViewById(R.id.btnPrecedent);
    }
    public void btnPrecedent(View view){
        Intent intent = new Intent(SecondeActivity.this,MainActivity.class);
        finish();
    }
}
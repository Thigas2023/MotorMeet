package com.example.motormeet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PwdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pwd);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button sendEmailButton = findViewById(R.id.button);
        TextView backSubtitle = findViewById(R.id.subtitle);

        View.OnClickListener goToLoginListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PwdActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        };

        sendEmailButton.setOnClickListener(goToLoginListener);
        backSubtitle.setOnClickListener(goToLoginListener);
    }
}

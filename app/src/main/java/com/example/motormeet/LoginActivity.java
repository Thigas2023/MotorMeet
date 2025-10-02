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

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button createAccountButton = findViewById(R.id.button2);
        TextView createAccountSubtitle = findViewById(R.id.subtitle);
        TextView forgotPasswordLink = findViewById(R.id.link);

        View.OnClickListener createAccountListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener forgotPasswordListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, PwdActivity.class);
                startActivity(intent);
            }
        };

        createAccountButton.setOnClickListener(createAccountListener);
        createAccountSubtitle.setOnClickListener(createAccountListener);
        forgotPasswordLink.setOnClickListener(forgotPasswordListener);
    }
}

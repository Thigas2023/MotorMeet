package com.example.motormeet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button createAccountButton = findViewById(R.id.button);
        final CheckBox termsCheckbox = findViewById(R.id.checkBox);

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (termsCheckbox.isChecked()) {
                    Intent intent = new Intent(SignupActivity.this, AddInfoActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(SignupActivity.this, "Você deve aceitar os termos para continuar.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

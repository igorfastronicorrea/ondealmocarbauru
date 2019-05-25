package br.com.mobot.ondealmoarembauru.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import br.com.mobot.ondealmoarembauru.R;

public class LoginActivity extends AppCompatActivity {

    private EditText edtRA, edtPass;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_login);

        edtRA = findViewById(R.id.edtRA);
        edtPass = findViewById(R.id.edtPass);
        btnLogin = findViewById(R.id.btnLogin);


    }
}

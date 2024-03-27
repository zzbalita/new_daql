package fpoly.huyndph40487.qlda_bantrsua;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import fpoly.huyndph40487.qlda_bantrsua.view.HomeFragment;

public class SignUpActivity extends AppCompatActivity {
    private TextInputLayout ed_email, ed_pass;
    private Button btn_signup;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initUi();
        initListener();
    }

    private void initListener() {
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickSignUp();
            }
        });
    }

    private void onClickSignUp() {
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        String email = ed_email.getEditText().getText().toString().trim();
        String password = ed_pass.getEditText().getText().toString().trim();
        progressDialog.show();
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                            startActivity(intent);
                            finishAffinity();
                        } else {

                            Toast.makeText(SignUpActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    private void initUi() {
        ed_email = findViewById(R.id.txt_input_email);
        ed_pass = findViewById(R.id.txt_input_pass);
        btn_signup = findViewById(R.id.btn_signup);
        progressDialog = new ProgressDialog(this);
    }
}